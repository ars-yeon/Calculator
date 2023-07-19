package com.example.calculator.Lv3
import java.math.BigDecimal

class VariableTypeChecker {
    fun isInteger(num: BigDecimal): Boolean {
        return num.stripTrailingZeros().scale() <= 0
    }
}