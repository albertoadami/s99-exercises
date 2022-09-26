package it.adami.exercise.list

object P01 {

  def last[A](list: List[A]): A = list match {
    case h :: Nil  => h
    case _ :: tail => last(tail)
    case _         => throw new NoSuchElementException
  }

}
