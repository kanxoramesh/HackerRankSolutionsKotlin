package dynamic_programming

class Candies {
}

fun main() {

}

fun candies(n: Int, a: Array<Int>): Long {
    var c = LongArray(n)
    c[0] = 1L;

    for (i in 1 until n) {
        if (a[i] > a[i - 1])
            c[i] = c[i - 1] + 1;
        else
            c[i] = 1;
    }
    for (i in n - 2 downTo 0) {
        if (a[i] > a[i + 1])
            c[i] = Math.max(c[i], c[i + 1] + 1)
    }
    var sum = 0L;
    for (x in c) {
        sum += x;
    }
    return sum;


}
