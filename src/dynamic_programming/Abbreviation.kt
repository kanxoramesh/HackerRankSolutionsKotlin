package dynamic_programming

import kotlin.math.max
import kotlin.math.sign

class Abbreviation {
}

fun abbreviation(a: String, b: String): String {

    val isValid = Array(a.length + 1) {
        BooleanArray(
            b.length + 1
        )
    }
    isValid[0][0] = true
    for (i in 1..a.length) {
        if (Character.isUpperCase(a[i - 1])) {
            isValid[i][0] = false
        } else isValid[i][0] = true
    }
    for (i in 1..a.length) {
        for (j in 1..b.length) {
            if (a[i - 1] === b[j - 1]) {
                isValid[i][j] = isValid[i - 1][j - 1]
            } else if (Character.toUpperCase(a[i - 1]) === b[j - 1]) {
                isValid[i][j] = isValid[i - 1][j - 1] || isValid[i - 1][j]
            } else if (Character.isUpperCase(a[i - 1])) {
                isValid[i][j] = false
            } else {
                isValid[i][j] = isValid[i - 1][j]
            }
        }
    }
    return if (isValid[a.length][b.length]) "YES" else "NO"

}

fun main() {
    var a = 'c';
    var b = 'C'
    println(a == b)

}