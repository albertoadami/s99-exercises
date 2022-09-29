package it.adami.exercise.list

object P15 {

  def duplicateN[A](n: Int, ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => List.fill(n)(h) ::: duplicateN(n, tail)
  }

  def duplicateNTail[A](n: Int, ls: List[A]): List[A] = {
    def loop(acc: List[A], ls: List[A]): List[A] = ls match {
      case Nil => acc.reverse
      case h :: tail => loop(List.fill(n)(h) ::: acc, tail)
    }
    loop(List.empty, ls)
  }

  def duplicateFunctional[A](n : Int, ls: List[A]): List[A] = ls.foldRight(List.empty[A]){ (el, acc) =>
    List.fill(n)(el) ::: acc
  }


}
