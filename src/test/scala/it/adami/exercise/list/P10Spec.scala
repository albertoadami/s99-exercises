package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P10Spec extends SpecBase {

  "P10" should {
    "encode a List" in {
      P10.encode(List(1, 1)) shouldBe List((2, 1))
      P10.encode(List(1, 1, 1, 3, 4, 4, 4, 4, 3, 2, 1, 1)) shouldBe List((3, 1), (1, 3), (4, 4), (1, 3), (1, 2), (2, 1))
      P10.encode(List(1, 1, 3, 4, 4, 4, 3, 2, 1)) shouldBe List((2, 1), (1, 3), (3, 4), (1, 3), (1, 2), (1, 1))
    }

  }


}
