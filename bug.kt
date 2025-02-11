fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    // ConcurrentModificationException
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    for (item in list2) {
        if (item % 2 == 0) {
            list2.remove(item)
        }
    }
    println(list2) // throws ConcurrentModificationException
}