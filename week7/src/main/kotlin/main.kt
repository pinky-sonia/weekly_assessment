fun reverse (list: List<Int>): List<Int> {
    val result: ArrayList<Int> = arrayListOf()
    for (i: Int in 0 until list.size - 1) {
        val numnber: Int = list [list.size - 1 - i]
        result.add (numnber)
    }
    return result
}



fun main(){
    val list: List<Int> = listOf(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    println(reverse(list))

}