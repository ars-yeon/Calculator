package com.example.calculator.Lv1
import java.util.Scanner
import kotlin.math.pow
import kotlin.math.roundToInt

// Lv1. 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고,
// 클래스를 이용하여 연산을 진행하고 출력하기

fun main() {
    val scanner = Scanner(System.`in`)
    val calc = Calculator1()

    println("숫자를 입력하세요.")
    var num1 = scanner.nextDouble()

    println("연산자를 입력하세요. (+, -, *, /)")
    var operator = scanner.next()[0]  // Scanner는 단일문자를 입력받는 메서드는 제공X, Sanner.next()로 첫번째 글자를 추출하는 방법으로 사용

    println("숫자를 입력하세요.")
    var num2 = scanner.nextDouble()

    val result = calc.calculate(num1, operator, num2)
    val roundedResult = roundToDecimalPlaces(result, 2)  // 소수점 아래 2자리까지 보이기

    // 정수로 변환 가능한 경우 toInt()로 변환, 아니면 값 유지
    // takeIf 함수는 주어진 조건식이 true인 경우에만 해당 값을 반환
    val finalResult = result.takeIf {it % 1 == 0.0} ?.toInt() ?: roundedResult
    val finalNum1 = num1.takeIf {it % 1 == 0.0} ?.toInt() ?: num1
    val finalNum2 = num2.takeIf {it % 1 == 0.0} ?.toInt() ?: num2

    println("$finalNum1 $operator $finalNum2 = $finalResult")
}

class Calculator1 {
    fun calculate(num1: Double, operator: Char, num2: Double): Double {
        return when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> throw IllegalArgumentException("연산자를 확인하세요.")
        }
    }
}

// 부동 소수점 문제를 해결하기 위한 반올림 함수 (가장 좋은 방법은 'BigDecimal' 클래스를 사용하는 것)
fun roundToDecimalPlaces(value: Double, decimalPlaces: Int): Double {
    val factor = 10.0.pow(decimalPlaces.toDouble())
    return (value * factor).roundToInt() / factor  // roundToInt()로 소수점 이하를 반올림하고 factor로 나누어 해당 자릿수까지 근사화된 값을 반환
}
