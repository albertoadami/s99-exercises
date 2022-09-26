package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P08Spec extends SpecBase {

  "P08" should {
    "compress a List" in {
      P08.compress(List(1, 1)) shouldBe List(1)
      P08.compress(List(1, 1, 1, 3, 4, 4, 4, 4, 3, 2, 1, 1)) shouldBe List(1, 3, 4, 3, 2, 1)
      P08.compress(List(1, 1, 3, 4, 4, 4, 3, 2, 1)) shouldBe List(1, 3, 4, 3, 2, 1)

      P08.compressTailRecursive(List(1, 1)) shouldBe List(1)
      P08.compressTailRecursive(List(1, 1, 1, 3, 4, 4, 4, 4, 3, 2, 1, 1)) shouldBe List(1, 3, 4, 3, 2, 1)
      P08.compressTailRecursive(List(1, 1, 3, 4, 4, 4, 3, 2, 1)) shouldBe List(1, 3, 4, 3, 2, 1)
    }

  }


}
