package com.example.calculator.Lv3
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val calc = Calculator()
    val numChecker = NumberChecker(scanner)  // num1, num2 입력값이 숫자인지 체크
    val operatorChecker = OperatorChecker()  // operator 입력값이 '+', '-', '*', '/' 중에 있는지 없는지 체크
    val typeChecker = VariableTypeChecker()  // 변수가 정수인지 아닌지 체크

    println("숫자를 입력하세요.")
    var num1 = numChecker.isNumber()

    println("연산자를 입력하세요. (+, -, *, /)")
    var operator = operatorChecker.isOperator(scanner)

    println("숫자를 입력하세요.")
    var num2 = numChecker.isNumber()

    val result = calc.calculate(num1, operator, num2)
    val finalResult = if (typeChecker.isInteger(result)) result else result.toInt()

    println("$num1 $operator $num2 = $finalResult")
}