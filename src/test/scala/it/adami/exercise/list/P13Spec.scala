package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P13Spec extends SpecBase {

  "P13" should {
    "encodeDirect a List" in {
      P13.encodeDirect(List(1)) shouldBe (List((1, 1)))
      P13.encodeDirect(List(1, 1, 1)) shouldBe List((3, 1))
      P13.encodeDirect(List(1, 1, 1, 2, 2, 2, 2, 5, 4, 7, 7)) shouldBe List((3, 1), (4, 2), (1, 5), (1, 4), (2, 7))

      P13.encodeDirectTail(List(1)) shouldBe (List((1, 1)))
      P13.encodeDirectTail(List(1, 1, 1)) shouldBe List((3, 1))
      P13.encodeDirectTail(List(1, 1, 1, 2, 2, 2, 2, 5, 4, 7, 7)) shouldBe List((3, 1), (4, 2), (1, 5), (1, 4), (2, 7))

    }

  }


}
