//Kotlin library Kotlin.comparison
fun main() {
   var x:MutableList<MutableList<Int>> =mutableListOf(mutableListOf(4,3),mutableListOf(3,4),mutableListOf(3,6))
   println(x)
   x.sortWith(compareBy({it[0]},{it[1]}))
   println(x)
} 