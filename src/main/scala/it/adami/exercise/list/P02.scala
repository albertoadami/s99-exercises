package it.adami.exercise.list

object P02 {

  def penultimate[A](list: List[A]): A = list match {
    case _ :: xs :: _ :: Nil  => xs
    case _ :: tail => penultimate(tail)
    case _         => throw new NoSuchElementException
  }

}
