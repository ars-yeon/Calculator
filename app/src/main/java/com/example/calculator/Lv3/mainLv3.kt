package com.example.calculator.Lv3
import java.math.BigDecimal
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val calc = Calculator()
    val checker = VariableTypeChecker()

    println("숫자를 입력하세요.")
    var num1 = BigDecimal(scanner.next())

    println("연산자를 입력하세요. (+, -, *, /)")
    var operator = scanner.next()[0]  // Scanner.next()로 첫번째 글자를 추출

    println("숫자를 입력하세요.")
    var num2 = BigDecimal(scanner.next())

    val result = calc.calculate(num1, operator, num2)
    val finalResult = if (checker.isInteger(result)) result else result.toInt()

    println("$num1 $operator $num2 = $finalResult")
}