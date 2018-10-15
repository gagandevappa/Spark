

object marvelTest {
  def main(arg: Array[String]) {
    val marvel=Array("Iron Man","Captain America","Hulk","Spider Man","Thor","Dead pool")
    //println(marvel.length)
      var i=0
      println("Array in Straight order:")
      while(i<marvel.length) {
        println(marvel(i))
        i=i+1
      }
      println("\n\n Array in Reverse order")
      println("Hello Gagan")
      var j=marvel.length-1
      while(j>=0) {
        println(marvel(j))
        j=j-1
      }
  }
}