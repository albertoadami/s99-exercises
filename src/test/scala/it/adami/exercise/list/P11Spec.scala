package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P11Spec extends SpecBase {

  "P11" should {
    "encodeModified a List" in {
      P11.encodeModified(List(1, 1)) shouldBe List((2, 1))
      P11.encodeModified(List(1, 1, 1, 3, 4, 4, 4, 4, 3, 2, 1, 1)) shouldBe List((3, 1), 3, (4, 4), 3, 2, (2, 1))
      P11.encodeModified(List(1, 1, 3, 4, 4, 4, 3, 2, 1)) shouldBe List((2, 1), 3, (3, 4), 3, 2, 1)
    }

  }


}
