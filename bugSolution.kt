fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Solution 1: Iterate over a copy
    val copy = list.toMutableList()
    for (item in copy) {
        if (item % 2 == 0) {
            list.remove(item)
        }
    }
    println(list) // Output: [1, 3, 5]

    // Solution 2: Iterate backwards
    for (i in list.size - 1 downTo 0) {
        if (list[i] % 2 == 0) {
            list.removeAt(i)
        }
    }
    println(list) // Output: [1, 3, 5]

    // Solution 3: Use iterator.remove()
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 3, 5]
    
    //Solution 4: Using removeIf
    val list4 = mutableListOf<Int>(1,2,3,4,5)
    list4.removeIf {it % 2 == 0}
    println(list4) // Output: [1, 3, 5]
} 