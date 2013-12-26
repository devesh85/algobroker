package broker
import OrderTypesDefinitions._



sealed trait OrderEvent {
  val message: Message
}

case class NewOrderCreated(message:Message) extends OrderEvent


//case class NewOrderCreatedEvent(orderId:Id, clOrdId:Id, orderQty:Quantity)
//case class OrderPartiallyFilledEvent(orderId:Id, cumQty:Quantity)
//case class OrderCancelled(orderId:Id)
