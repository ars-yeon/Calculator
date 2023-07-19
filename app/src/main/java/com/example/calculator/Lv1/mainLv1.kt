package com.example.calculator.Lv1
import java.math.BigDecimal  // 부동 소수점 정확성 문제 해결을 위해 사용
import java.util.Scanner

// Lv1. 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고,
// 클래스를 이용하여 연산을 진행하고 출력하기

fun main() {
    val scanner = Scanner(System.`in`)
    val calc = Calculator1()

    println("숫자를 입력하세요.")
    var num1 = BigDecimal(scanner.next())

    println("연산자를 입력하세요. (+, -, *, /)")
    var operator = scanner.next()[0]  // Sanner.next()로 첫번째 글자를 추출

    println("숫자를 입력하세요.")
    var num2 = BigDecimal(scanner.next())

    val result = calc.calculate(num1, operator, num2)
    val finalResult = if (result.scale() > 0) result else result.toInt()  // 변수의 소수점 자릿수 확인, 소수점 있으면 그대로 유지하고 없으면 정수로 변환

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

