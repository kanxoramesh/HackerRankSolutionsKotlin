package geeks

class ArrayRotation {
}

fun main() {
    var a = checkArrayRotation(arrayOf<Int>(0, 1))
    println(a)
}
//2,3,4 => 4,3,2

fun checkArrayRotation(array: Array<Int>): Int {
    var arraySize = array.size
    var min=array[0]
    var minIdex=0
    for(i in 0 until arraySize){
        if(min>array[i])
        {
            min=array[i]
            minIdex=i
        }
    }
    return minIdex

}