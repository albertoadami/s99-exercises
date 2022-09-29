package it.adami.exercise.list

object P14 {

  def duplicate[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => h :: h :: duplicate(tail)
  }

  def duplicateTail[A](ls: List[A]): List[A] = {
    def loop(acc: List[A], ls: List[A]): List[A] = ls match {
      case Nil => acc.reverse
      case h :: tail => loop(h :: h :: acc, tail)
    }
    loop(List.empty, ls)
  }

  def duplicateFunctional[A](ls: List[A]) = ls.foldRight(List.empty[A]){ (el, acc) =>
    List(el, el) ::: acc
  }


}
