

object ifElse {
  def main(arg: Array[String]) {
    var fruit="Mango"
    val color =  { if(fruit =="grapes") {println("The fruit guess is correct")}
    else {
      println("Wrong Guess!! The actual fruit was "+fruit) 
    }
  ;10}
  print(color)
  }
}