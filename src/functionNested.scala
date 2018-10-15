

object functionNested {
  def main(arg: Array[String]) {
    println("Main Function:"+exec(time()))
        
    def time():Long = {
      println("Inside time Function")
      return System.nanoTime()
    }
    //def exec(t: => Long):Long = { //call by value
    def exec(t: => Long):Long = { //call by name
      println("Inside exec function")
      println("Time: "+t)
      println("calling t again....")
      return t
    }
  }
}