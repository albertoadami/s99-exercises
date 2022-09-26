package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P02Spec extends SpecBase {

  "P02" should {
    "return the penultimate element of the list" in {
      P02.penultimate(List(1, 2, 3, 4, 5)) shouldBe 4
      P02.penultimate(List(1, 3, 4)) shouldBe 3
      the [NoSuchElementException] thrownBy P02.penultimate(List[Int](1))
      the [NoSuchElementException] thrownBy P02.penultimate(List[Int]())
    }

  }


}
