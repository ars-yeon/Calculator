package com.example.calculator.Lv3

import java.math.BigDecimal

class Calculator {
    fun calculate(num1: BigDecimal, operator: Char, num2: BigDecimal): BigDecimal {
        val operation: Operation = when (operator) {
            '+' -> AddOperation()
            '-' -> SubtractOperation()
            '*' -> MultiplyOperation()
            '/' -> DivideOperation()
            else -> throw IllegalArgumentException("연산자를 확인하세요.")
        }
        return operation.operate(num1, num2)
    }
}