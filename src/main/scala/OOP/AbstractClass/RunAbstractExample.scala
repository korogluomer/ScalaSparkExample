package OOP.AbstractClass

object RunAbstractExample {
  def main(args: Array[String]): Unit = {
    val printer:ConsolePrinter=new ConsolePrinter
    printer.setMessage("Hello World")
    printer.printMessage()
  }
}
