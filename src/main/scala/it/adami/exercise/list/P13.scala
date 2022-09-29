package it.adami.exercise.list

object P13 {

  def encodeDirect[A](ls: List[A]): List[(Int, A)] = ls match {
    case Nil => Nil
    case h :: tail =>
      val repeatingElements = tail.takeWhile(_ == h)
      val remainingElements = tail.dropWhile(_ == h)
      (1 + repeatingElements.size, h) :: encodeDirect(remainingElements)
  }

  def encodeDirectTail[A](ls: List[A]): List[(Int, A)] = {
    def loop(ls: List[A], acc: List[(Int, A)]): List[(Int, A)] = ls match {
      case Nil => acc
      case h :: tail =>
        val repeatingElements = tail.takeWhile(_ == h)
        val remainingElements = tail.dropWhile(_ == h)
        val newElement = (1 + repeatingElements.size, h)
        loop(remainingElements, acc :+ newElement)
    }
    loop(ls, List.empty)
  }

}
