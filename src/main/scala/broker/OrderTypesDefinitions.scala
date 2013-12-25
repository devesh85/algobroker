package broker

object OrderTypesDefinitions {
	type Quantity = Double
    type OrderId = String
    type ExecType = String
    type OrderStatus = String
    object ExecTransType extends Enumeration{
	  val New = Value
	}
}