package it.adami.exercise.list

object P11 {

  def encodeModified[A](ls: List[A]): List[Any] =
    P09.pack(ls).map{ l =>
      if(l.size == 1) l.head
      else (l.size, l.head)
    }
}
