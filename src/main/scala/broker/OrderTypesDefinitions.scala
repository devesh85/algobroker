package broker

import java.util.UUID

object OrderTypesDefinitions {
	type Quantity = Double
    type Id = String
    type ExecType = String
    type OrderStatus = String
    object ExecTransType extends Enumeration{
	  val New = Value
	}
	
	
	def getOrderId():Id = UUID.randomUUID().toString()
}