package OOP.ClassParameter

class LinkedList[X] {

  private class Node[X](elem: X) {
    var next: Node[X] = _

    override def toString: String = elem.toString
  }

  private var head: Node[X] = _

  def add(elem: X): Unit = {
    val value = new Node(elem)
    value.next = head
    head = value
  }

  private def printNodes(value: Node[X]): Unit = {
    if (value != null) {
      println(value)
      printNodes(value.next)
    }
  }
  def printAll(): Unit ={
    printNodes(head)
  }

}

object LinkedList {
  def main(args: Array[String]): Unit = {
    val ints=new LinkedList[Int]()
    ints.add(1)
    ints.add(2)
    ints.add(3)
    ints.printAll()
    val strings=new LinkedList[String]()
    strings.add("Öemr")
    strings.add("Öas")
    strings.add("Öfeq")
    strings.printAll()
    val doubles=new LinkedList[Double]()
    doubles.add(3.5)
    doubles.add(5.89)
    doubles.add(7.65)
    doubles.printAll()
  }
}
