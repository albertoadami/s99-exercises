package it.adami.exercise.list

object P07 {

  def flatten(l: List[Any]): List[Any] = l flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }


}
