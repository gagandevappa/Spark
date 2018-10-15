

object factorialTest {
  def main(arg: Array[String]) {
    println("Enter the number for factorial generation")
    def facto(input: Int):Int = {
      var p:Int=0
      if(input==0) {
        return 1
      }
      else {
      p= input * facto(input-1)
      }   
      return p
    }
    val input=readLine().toInt
    val test=facto(input)
    println("factorial is:\n"+test)
    
  }
}