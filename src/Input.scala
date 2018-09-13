import scala.io.StdIn

object ConsoleAction {

  def main(args: Array[String]) {
  val man = new Man
    println(man.print())

  }
}

class Man {
  def print() : String = {
    println("input str ")
    scala.io.StdIn.readLine()
   }
}