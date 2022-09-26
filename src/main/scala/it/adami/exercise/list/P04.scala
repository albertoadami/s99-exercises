package it.adami.exercise.list

import scala.annotation.tailrec

object P04 {

  def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }

  def lengthTail[A](list: List[A]): Int = {
    def lenghtAcc[A](l: List[A], acc: Int): Int =  l match {
      case Nil => acc
      case _ :: tail => lenghtAcc(tail, acc + 1)
    }
    lenghtAcc(list, 0)
  }
}
