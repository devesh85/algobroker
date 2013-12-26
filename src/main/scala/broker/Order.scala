package broker

import OrderTypesDefinitions._
import quickfix.field.OrigClOrdID

object Order extends AggregateFactory [Order, OrderEvent] {
	def create(message:Message) = applyCreated(NewOrderCreated(message))
	def applyEvent = {
	  case event: NewOrderCreated => applyCreated(event)
	  case event => unhandled(event)
	}
	
	private def applyCreated(event: NewOrderCreated) = event.message match {
	  case NewOrderMessage(cl, orig, qty) => NewOrder(event::Nil, cl, orig, qty)
	  case _ => unhandled(event)
	} 
}

sealed trait Order extends AggregateRoot[Order, OrderEvent]

case class NewOrder (uncommittedEvents: List[OrderEvent], clOrdId:Id, OrigClOrdID:Id, orderQuantity:Quantity) extends Order{
    def applyEvent = {
      case event => unhandled(event)
    }
    def markCommitted = copy(uncommittedEvents = Nil)
    val orderId = getOrderId
}

//case class PartiallyFilledOrder() extends Order
//
//case class FilledOrder() extends Order
