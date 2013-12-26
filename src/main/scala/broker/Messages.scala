package broker

import OrderTypesDefinitions._

sealed trait Message 

case class NewOrderMessage (clOrdId:Id, origClOrdId:Id, qty:Quantity) extends Message