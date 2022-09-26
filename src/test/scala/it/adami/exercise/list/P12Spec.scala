package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P12Spec extends SpecBase {

  "P12" should {
    "decode a List" in {
      P12.decode(List((1, 1))) shouldBe List(1)
      P12.decode(List((3, 1))) shouldBe List(1, 1, 1)
      P12.decode(List((3, 1), (4, 2), (1, 5), (1, 4), (2, 7))) shouldBe List(1, 1, 1, 2, 2, 2, 2, 5, 4, 7, 7)

      P12.decodeTail(List((1, 1))) shouldBe List(1)
      P12.decodeTail(List((3, 1))) shouldBe List(1, 1, 1)
      P12.decodeTail(List((3, 1), (4, 2), (1, 5), (1, 4), (2, 7))) shouldBe List(1, 1, 1, 2, 2, 2, 2, 5, 4, 7, 7)

      P12.decodeFunctional(List((1, 1))) shouldBe List(1)
      P12.decodeFunctional(List((3, 1))) shouldBe List(1, 1, 1)
      P12.decodeFunctional(List((3, 1), (4, 2), (1, 5), (1, 4), (2, 7))) shouldBe List(1, 1, 1, 2, 2, 2, 2, 5, 4, 7, 7)


    }

  }


}
