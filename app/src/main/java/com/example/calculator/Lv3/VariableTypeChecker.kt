package com.example.calculator.Lv3
import java.math.BigDecimal

class VariableTypeChecker {
    fun isNumber(input: String): Boolean {
        return try {
            BigDecimal(input)
            true  // 숫자로 변환O
        } catch (e: NumberFormatException) {
            false  // 숫자로 변환X
        }
    }

    fun isInteger(num: BigDecimal): Boolean {
        return num.stripTrailingZeros().scale() <= 0
    }
}