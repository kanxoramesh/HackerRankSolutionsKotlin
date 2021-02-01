import java.util.*

class PlusMinus {
}

fun main() {
    var a = intArrayOf(3, 4, -5, 6, 0)
    //plusMinus(a.toTypedArray())
    //miniMaxSum(a.toTypedArray())
    println(timeConversion("04:59:59AM"))
}

fun plusMinus(arr: Array<Int>): Unit {
    var p = 0f
    var n = 0f
    var z = 0f

    for (i in 0 until arr.size) {
        if (arr[i] == 0) {
            z++
        } else if (arr[i] > 0) {
            p++

        } else
            n++

    }
    var size = arr.size
    println(String.format("%.5f", p / size))
    println(String.format("%.5f", n / size))
    println(String.format("%.5f", z / size))

}

fun miniMaxSum(arr: Array<Int>) {
    var max = 0
    var min = 0
    Arrays.sort(arr)
    for (i in 0 until arr.size) {
        if (i != 0) {
            max += arr[i]
        }
        if (i != 4) {
            min += arr[i]
        }
    }
    print(min)
    print(" ")
    print(max)
}

fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */

    var part = s.split(":")
    var hour = part[0]
    var minute = part[1]
    var second = part[2].subSequence(0, 2)
    var ap = part[2].subSequence(2, 4)

    var str = ""
    if (ap == "AM") {
        if (hour == "12") {
            return "00" +":"+ minute +":"+ second
        }
        return hour+":" + minute +":"+ second
    } else {
        if (hour.toInt() < 12) {
            return (12 + hour.toInt()).toString() +":" +minute +":"+ second

        }
        return hour +":"+ minute +":"+ second

    }


};

