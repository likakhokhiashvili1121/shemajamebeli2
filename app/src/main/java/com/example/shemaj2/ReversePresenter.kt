package com.example.shemaj2

class ReversePresenter {
    fun reverse(userInput :String,charactersToEscape :String): String {
        val str = userInput.toCharArray()
        val str2 = charactersToEscape.toCharArray()
        var right = str.size - 1
        var left = 0

        while (left < right) {
            when {
                str2.contains(str[left]) -> left++
                charactersToEscape.contains(str[right]) -> right--
                else -> {
                    val tmp = str[left]
                    str[left] = str[right]
                    str[right] = tmp
                    left++
                    right--
                }
            }
        }
        return String(str)
    }
}