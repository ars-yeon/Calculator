package com.example.calculator.Lv3
import java.math.BigDecimal
import java.util.Scanner


// 입력값이 숫자인지 체크
class NumberChecker(private val scanner: Scanner) {
    fun isNumber(): BigDecimal {
        var validInput = false
        var num: BigDecimal? = null

        while (!validInput) {
            val input = scanner.next()

            try {
                num = BigDecimal(input)
                validInput = true
            } catch (e: NumberFormatException) {
                println("잘못된 입력입니다. 다시 입력해주세요.")
            }
        }
        return num!!
    }
}