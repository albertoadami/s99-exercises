package it.adami.exercise.list

object P05 {

  def reverse[A](list: List[A]): List[A] = list match {
    case Nil => List.empty[A]
    case x :: xs => reverse(xs) :+ x
  }

  def reverseTail[A](list: List[A]): List[A] = {
      def tailFunction[A](list: List[A], acc: List[A]): List[A] = list match {
        case Nil => acc
        case x :: xs => tailFunction(xs, x :: acc)
      }
    tailFunction(list, List.empty)

  }

}
