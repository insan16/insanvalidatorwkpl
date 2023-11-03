//class PasswordValidator digunakan untuk validasi panjang password.
package com.insan.insanvalidatorwkpl

class PasswordValidator {
    //Method yang berfungsi untuk memeriksa apakah panjang password memenuhi syarat.
    //Syarat dari panjang password adalah lebih dari sama dengan 6.
    fun isPasswordLengthValid(password: String): Boolean {
        return password.length >= 6
    }
}