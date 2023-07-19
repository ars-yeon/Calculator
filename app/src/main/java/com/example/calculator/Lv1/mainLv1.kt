package com.example.calculator.Lv1
import java.math.BigDecimal  // 부동 소수점 정확성 문제 해결을 위해 사용
import java.util.Scanner  //

// Lv1. 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고,
// 클래스를 이용하여 연산을 진행하고 출력하기

fun main() {
    val scanner = Scanner(System.`in`)
    val calc = Calculator1()

    println("숫자를 입력하세요.")
    var num1 = BigDecimal(scanner.next())

    println("연산자를 입력하세요. (+, -, *, /)")
    var operator = scanner.next()[0]  // Scanner는 단일문자를 입력받는 메서드는 제공X, Sanner.next()로 첫번째 글자를 추출하는 방법으로 사용

    println("숫자를 입력하세요.")
    var num2 = BigDecimal(scanner.next())

    val result = calc.calculate(num1, operator, num2)

    val finalResult = if (result.scale() > 0) result else result.toInt()

    println("$num1 $operator $num2 = $finalResult")
}

class Calculator1 {
    fun calculate(num1: BigDecimal, operator: Char, num2: BigDecimal): BigDecimal {
        return when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> throw IllegalArgumentException("연산자를 확인하세요.")
        }
    }
}

