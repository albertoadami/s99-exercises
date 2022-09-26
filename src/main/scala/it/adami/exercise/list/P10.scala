package it.adami.exercise.list

object P10 {

  def encode[A](ls: List[A]): List[(Int, A)] =
    P09.pack(ls).map(l => (l.size, l.head))
}
