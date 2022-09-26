package it.adami.exercise.list

object P12 {

  def decode[A](ls: List[(Int, A)]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => List.fill(h._1)(h._2) ::: decode(tail)
  }

  def decodeTail[A](ls: List[(Int, A)]): List[A] = {
    def loop(acc: List[A], ls: List[(Int, A)]): List[A] = ls match {
      case Nil => acc.reverse
      case h :: tail => loop(List.fill(h._1)(h._2) ::: acc, tail)
    }
    loop(List.empty, ls)
  }

  def decodeFunctional[A](ls: List[(Int, A)]): List[A] =
    ls.foldLeft(List.empty[A]){
      case (acc, el) =>
        val (counter, value) = el
        val elementList = List.fill(counter)(value)
        elementList ::: acc
    }.reverse //more efficient

}
