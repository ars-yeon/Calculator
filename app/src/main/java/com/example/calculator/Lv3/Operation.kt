package com.example.calculator.Lv3
import java.math.BigDecimal

// Add/Subtract/Multiply/Divide Operation 클래스에 공통된 연산 메서드 정의
interface Operation {
    fun operate(num1: BigDecimal, num2: BigDecimal): BigDecimal
}