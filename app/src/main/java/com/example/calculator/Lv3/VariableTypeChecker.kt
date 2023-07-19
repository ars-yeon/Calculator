package com.example.calculator.Lv3
import java.math.BigDecimal

// 변수가 정수인지 아닌지 체크
class VariableTypeChecker {
    fun isInteger(num: BigDecimal): Boolean {
        return num.stripTrailingZeros().scale() <= 0
    }
}