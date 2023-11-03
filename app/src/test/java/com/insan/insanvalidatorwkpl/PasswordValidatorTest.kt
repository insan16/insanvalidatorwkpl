package com.insan.insanvalidatorwkpl

import org.junit.Assert
import org.junit.Test

//Class PasswordValidatorTest merupakan kelas unit test yang digunakan untuk menguji.
class PasswordValidatorTest {
    @Test

    //Method yang berfungsi untuk menguji validitas panjang password.
    fun testPasswordLength() {
        val passwordValidator = PasswordValidator()

        //Test jika panjang password kurang dari 6.
        val isShortPassword = passwordValidator.isPasswordLengthValid("16104")
        Assert.assertEquals(false, isShortPassword)

        //Test jika panjang password lebih dari atau sama dengan 6.
        val isLongPassword = passwordValidator.isPasswordLengthValid("160104")
        Assert.assertEquals(true, isLongPassword)
    }
}
