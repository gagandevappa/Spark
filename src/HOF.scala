

object HOF {
  def main(arg: Array[String]) {
    def id(x:Int):Int = x
    def sumId(a: Int,b: Int):Int = {
      if(a>b)0 else id(a)+sumId(a+1,b)
      
    }
    def square(x:Int):Int=x*x
    def sumSquare(a:Int,b:Int):Int = {
      if(a>b)0 else square(a)+sumSquare(a+1,b)
    }
    def power(x:Int):Int= if (x==0)1 else 2*power(x-1)
    def sumPower(a:Int,b:Int):Int = {
      if(a>b)0 else power(a)+sumPower(a+1,b)
    }
    def neutral(f:Int =>Int,a:Int,b:Int):Int = {
      if(a>b)0 else f(a)+neutral(f,a+1,b)
    }
    println("ID(5): "+id(5))
    println("sumId(2,5): "+sumId(3,5))
    println("square(5): "+square(5))
    println("sumSqure(2,5): "+sumSquare(3,5))
    println("power(5): "+power(5))
    println("sumPower(2,5): "+sumPower(2,4))
    println("**************************************************")
    println("sumId-1: "+neutral(id,3,5))
    println("sumId-1: "+neutral(square,3,5))
    println("sumId-1: "+neutral(power,2,4))
  }
}