import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack


class AlgoBrokerTest  extends FlatSpec with ShouldMatchers{
  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should equal (2)
    stack.pop() should equal (1)
  }
}