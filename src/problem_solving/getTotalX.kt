package problem_solving

import sun.java2d.cmm.lcms.LCMS
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {

    //first find lcm of a
    var lcm = getLcm(a)
    var hcf = getHcf(b)
    var count = 0
    var lcm_copy = lcm
    while (lcm <= hcf) {
        if (hcf % lcm == 0)
            count++
        lcm += lcm_copy

    }
    return count

}

fun getLcm(a: Array<Int>): Int {

    var lcm = a[0]
    for (i in 1 until a.size) {
        lcm = lcm(lcm, a[i])
    }
    return lcm

}

fun lcm(a: Int, b: Int): Int {
    var max = a
    var min = a
    if (a < b) {
        max = b
        min = a
    } else {
        max = a
        min = b
    }
    var i = 1
    while ((max * i) % min != 0) {
        i++
    }

    return max * i
}

fun getHcf(b: Array<Int>): Int {
//16,32,96
    var hcf = b[0] //16
    for (i in 1 until b.size) {
        hcf = hcf(hcf, b[i])
    }
    return hcf
}

fun hcf(aa: Int, bb: Int): Int {

    var a = aa
    var b = bb
    while (a != b) {
        if (a > b)
            a -= b;
        else
            b -= a;
    }
    return a

}


fun main(args: Array<String>) {

    val total = getTotalX(arrayOf<Int>(3, 9, 6), arrayOf<Int>(36, 72))

    println(total)
}
