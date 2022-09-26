package it.adami.exercise.list

object P08 {

  def compress[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case x :: xs => x :: compress(xs.dropWhile(_ == x))
  }

  def compressTailRecursive[A](ls: List[A]): List[A] = {
    def compressR(result: List[A], curList: List[A]): List[A] = curList match {
      case h :: tail => compressR(result :+ h, tail.dropWhile(_ == h))
      case Nil       => result
    }
    compressR(Nil, ls)
  }

}
