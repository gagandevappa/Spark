
import scala.math._
import java.math.BigInteger

object equilateralTest {
  def main(arg:Array[String]) {
    var area:Double=0.0
    def triangleArea(rad: Int):Double = {
      area =(((sqrt(3))/4)*(rad*rad))
      //println("Area of triangle1 is: "+area)
      return area
    }
    val area1=triangleArea(3)
    val area2=triangleArea(5)
    println("Area of triangle1 is: "+area1)
    println("Area of triangle2 is: "+area2)
    //val test1:BigInteger=123456789098765;
    val x=BigInt("123456789098765")
    println(x);
    val y=BigDecimal("3.141592653589793")
    println(y)
  }
}