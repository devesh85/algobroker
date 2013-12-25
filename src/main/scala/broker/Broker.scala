package broker

object Broker extends App{
	print ("Hello Broker")
	type Quantity = Float
    type Id = String
    type ExecType = String
    type OrderStatys = String
    
    
	trait Order {
	    def orderId : Id   
	}
	
	class ParentOrder (val orderId:Id) extends Order
    class ChildOrder (val orderId:Id)extends Order
    
    
}