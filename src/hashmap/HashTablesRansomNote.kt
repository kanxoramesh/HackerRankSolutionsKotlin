package hashmap

fun main() {

    var a = ransomenotecheck(
        arrayOf("give", "me", "one", "grand", "today", "night"),
        arrayOf("give", "one", "grand", "today",)
    )
    print(a)
}

fun ransomenotecheck(maga: Array<String>, note: Array<String>): String {
    var magahashmap = HashMap<String, Int>()
    for (i in maga) {
        var count = if (magahashmap.containsKey(i)) magahashmap.get(i) else 0

        magahashmap.put(i, count!! + 1)

    }
    var canWrite = "Yes"

    for (j in note) {
        if (magahashmap.containsKey(j)) {
            var count = magahashmap.get(j)
            if (count!! - 1 <= 0) {
                magahashmap.remove(j)
            } else
                magahashmap.put(j, count!! - 1)

        } else {
            canWrite = "No"
            break;
        }
    }
    return canWrite;

}