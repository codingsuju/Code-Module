//Working with the list
fun main(){
    var x=mutableListOf(mutableListOf(1,2),mutableListOf(3,4),mutableListOf(6,7))
    println("Current list is follows")
    println(x)
    var y = x.toMutableList()
    println("Adding (9,10) at the index 1 to the list")
    x.add(1,mutableListOf(9,10))
    println(x)
    println(y)
    println("Removing at the index 1 from the list ")
    x.removeAt(1)
    println(x)
}