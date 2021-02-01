package geeks

import kotlin.math.max

fun main(args: Array<String>) {
    var a = calculateMaxContiguous(arrayOf(1, 2, 3 - 2, 5))

    println(a)
}

fun calculateMaxContiguous(array: Array<Int>): Int {

    var currentrMax = array[0]
    var globalMax = array[1]
    for (i in 1 until array.size) {
        currentrMax = max(array[i], currentrMax + array[i])
        globalMax = max(currentrMax, globalMax)
    }

    return globalMax
}