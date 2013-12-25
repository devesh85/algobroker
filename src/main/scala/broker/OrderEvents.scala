package broker
import OrderTypesDefinitions._



sealed trait OrderEvent {
  val orderId: OrderId
}

case class NewOrderCreatedEvent(orderId:OrderId, clOrdId:OrderId, orderQty:Quantity)
case class OrderPartiallyFilledEvent(orderId:OrderId, cumQty:Quantity)
case class OrderCancelled(orderId:OrderId)
