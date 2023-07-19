package com.example.calculator.Lv3
import java.math.BigDecimal
import java.util.Scanner

// operator 입력값이 '+', '-', '*', '/' 중에 있는지 없는지 체크
class OperatorChecker {
    private val validOperator = setOf('+', '-', '*', '/')

    fun isOperator(scanner: Scanner): Char {
        val operator: Char

        while (true) {
            val input = scanner.next()

            // 입력값의 길이가 1이 아니거나 '+', '-', '*', '/'가 아니면 다시 입력
            if (input.length != 1 || input[0] !in validOperator) {
                println("잘못된 입력입니다. 다시 입력해주세요.")
            } else {
                operator = input[0]
                break
            }
        }
        return operator
    }
}