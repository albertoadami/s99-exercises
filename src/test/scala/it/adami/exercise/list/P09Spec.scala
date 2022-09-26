package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P09Spec extends SpecBase {

  "P09" should {
    "pack a List" in {
      P09.pack(List(1, 1)) shouldBe List(List(1, 1))
      P09.pack(List(1, 1, 1, 3, 4, 4, 4, 4, 3, 2, 1, 1)) shouldBe List(List(1, 1, 1), List(3), List(4, 4, 4, 4), List(3), List(2), List(1, 1))
      P09.pack(List(1, 1, 3, 4, 4, 4, 3, 2, 1)) shouldBe List(List(1, 1), List(3), List(4, 4, 4), List(3), List(2), List(1))
    }

  }


}
