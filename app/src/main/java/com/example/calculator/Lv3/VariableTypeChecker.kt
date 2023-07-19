package com.example.calculator.Lv3
import java.math.BigDecimal  // 숫자가 정수인지 아닌지를 확인하는 기능 제공

// 변수가 정수인지 아닌지 체크
class VariableTypeChecker {
    fun isInteger(num: BigDecimal): Boolean {

        return num.stripTrailingZeros().scale() <= 0
        // stripIrailingZreros() 숫자의 소수점 이하의 불필요한 0 제거
        // scale() 소수 자릿수 확인, 소수 자릿수가 0 이하라면 해당 숫자는 정수
        // scale()의 값이 0이하면 true, 아니면 false

    }
}