import java.util.*
import kotlin.math.max

class FlatlandSpaceStations {
}

fun main() {

}

fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
    if(n==c.size)
        return 0

    Arrays.sort(c)
    var max = c[0]//1,
//20 5 /////0,1,2,3,4,5,6,7,
//1,6,10,11,13
    for (i in 1 until c.size) {

        if (max < (c[i] - c[i - 1]) / 2)
            max = (c[i] - c[i - 1]) / 2
    }
    var last = (n-1) - c[c.size - 1]
    return Math.max(max, last)


}