

object readFromConsole {
  def main(arg: Array[String]) {
    val test=10
    var input =0 
    do {
      print("Enter the guessed no.")
      input=readLine.toInt
    }while(input != test) 
    //{
    println("Your guess no.: "+input+" is correct")
      /**}
      else {
        println("Incorrect Guess")
      }
    }**/
  }
}