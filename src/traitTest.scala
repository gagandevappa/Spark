

trait A {
  println("Your are in trait A")
}
trait B {
  println("Your are in trait B")
}
trait C {
  println("Your are in trait C") 
}
class D extends A with B with C {
  println("you are in class D")  
}
object traitTest {
  def main(arg: Array[String]) {
    val test1=new D()
  }
}