

object areaCircle {
  def main(arg: Array[String]) {
    def circleTest(rad:Int) {
      val area=3.1418*rad*rad
      println("area of circle with radius: "+rad+" is: "+area)
    }
    val hello1=circleTest(3)
    val hello2=circleTest(5)
  }
}