package hashmap

fun main() {

}

// Complete the freqQuery function below.
fun freqQuery(queries: Array<Array<Int>>): Array<Int> {

    var tempArray = arrayListOf<Int>()
    var hashMap = HashMap<Int, Int>()
    var hashforKeMap = HashMap<Int, Int>()

    for (item in queries) {
        var key = item[0]
        var value = item[1]
        if (key == 1) {
            var data = hashMap.getOrDefault(value, 0)
            if (hashforKeMap.containsKey(data)) {
                var tempval = hashforKeMap.getOrDefault(data, 0)
                if (tempval <= 1) {
                    hashforKeMap.remove(data)
                } else
                    hashforKeMap.replace(data, tempval - 1)
            }

            hashMap.put(value, data + 1)

            hashforKeMap.put(data + 1, hashforKeMap.getOrDefault(data + 1, 0) + 1)

        } else if (key == 2) {
            var data = hashMap.getOrDefault(value, 0)
            if (hashforKeMap.containsKey(data)) {
                var tempval = hashforKeMap.getOrDefault(data, 0)
                if (tempval <= 1) {
                    hashforKeMap.remove(data)
                } else
                    hashforKeMap.replace(data, tempval - 1)
            }
            hashMap.put(value, data - 1)
            hashforKeMap.put(data - 1, hashforKeMap.getOrDefault(data - 1, 0) + 1)


        } else if (key == 3) {

            if (hashforKeMap.getOrDefault(value, 0) > 0)
                tempArray.add(1)
            else
                tempArray.add(0)

        }

    }
    return tempArray.toTypedArray()


}
