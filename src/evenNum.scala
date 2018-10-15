

object evenNum {
  def main(arg: Array[String]) {
    println("Enter the number")
    val input=readLine().toInt
    if(input %2 ==0) {
      println("The number is even")
    }
    else
    {
      println("The number is odd")
    }
    def evenNums(input:Int):Int = {
      var i=0
      while(i<=input) {
        if (i%2==0) {
          println(i)
        }
        i=i+1
      }
      return i
    }
  evenNums(input)
  //println(test)
  }
}