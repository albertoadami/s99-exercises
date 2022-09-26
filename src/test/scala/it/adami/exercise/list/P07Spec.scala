package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P07Spec extends SpecBase {

  "P07" should {
    "flatten a List" in {
      P07.flatten(List(1, 1)) shouldBe List(1, 1)
      P07.flatten(List(List(1), List(2), 2, List(1))) shouldBe List(1, 2, 2, 1)
      P07.flatten(List(List(1), List(2, 2), List(1))) shouldBe List(1, 2, 2, 1)
    }

  }


}
