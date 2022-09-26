package it.adami.exercise.list

object P03 {

  def nth[A](index: Int, list: List[A]): A = list match {
    case Nil => throw new NoSuchElementException
    case x :: _ if index == 0 => x
    case _ :: x => nth(index - 1, x)
  }

}
