

object voterCheck {
  def main(arg: Array[String]) {
    println("Enter you age")
    val input1=readLine().toInt
    if(input1 > 18) {
      println("Your are eligible to vote")
    }
    else{
      println("Sorry you need to minimum 18yr old to vote")
    }
    
    
  }
}