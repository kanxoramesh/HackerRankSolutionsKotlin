package hashmap

class CountTriplets {
}

fun main() {

    var a = countTriplets(longArrayOf(1, 3, 9, 9, 27, 81).toTypedArray(), 3)
    println(a)
}

fun countTriplets(arr: Array<Long>, r: Long): Long {

    var rightHashMap = HashMap<Long, Long>()
    var leftHashMap = HashMap<Long, Long>()

    var totalCount = 0L
    for (i in arr) {
        rightHashMap.put(i, rightHashMap.getOrDefault(i, 0L) + 1)
    }

    for (i in 0 until arr.size) {

        var mid = arr[i]
        var leftNum = 0L
        var rightNum = 0L
        rightHashMap.put(mid, rightHashMap.getOrDefault(mid, 0L)!! - 1)

        if (leftHashMap.containsKey(mid / r) && mid % r == 0L)
            leftNum = leftHashMap.get(mid / r)!!;

        if (rightHashMap.containsKey(mid * r) )
            rightNum = rightHashMap.get(mid * r)!!;

        totalCount += leftNum * rightNum

        leftHashMap.put(mid, leftHashMap.getOrDefault(mid, 0L) + 1)


    }

    return totalCount

}
