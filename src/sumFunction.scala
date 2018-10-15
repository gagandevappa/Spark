

object sumFunction {
  def main(arg: Array[String]) {
    
    def sumTest(a: Double,b:Double):Double = {
      var sum:Double=0
      sum=a+b
      return sum
    }
    val sum1=sumTest(2.0,3.0)
    val sum2=sumTest(5.0,4.0)
    
    println("SUM-1: "+sum1)
    println("SUM-2: "+sum2)
  }
  
}