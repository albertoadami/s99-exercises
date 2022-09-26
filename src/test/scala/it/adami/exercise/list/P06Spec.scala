package it.adami.exercise.list

import it.adami.exercise.SpecBase


class P06Spec extends SpecBase {

  "P06" should {
    "return if the list is palindrome" in {
      P06.isPalindrome(List(1, 1)) shouldBe true
      P06.isPalindrome(List(1, 2, 2, 1)) shouldBe true
      P06.isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
      P06.isPalindrome(List(1, 2, 3, 3, 2, 1)) shouldBe true


      P06.isPalindrome(List(1, 2, 3, 4, 5)) shouldBe false
      P06.isPalindrome(List(1, 2, 4, 5)) shouldBe false
      P06.isPalindrome(List(5)) shouldBe true
      P06.isPalindrome(List[Int]()) shouldBe true
    }

  }


}
