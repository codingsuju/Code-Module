//Working with the MutableMap
fun main(){
    var f:MutableMap<Int,Int> = mutableMapOf(1 to 4,2 to 5, 3 to 6)
    f.put(4,7)
    f[4]=f.getValue(4)+1
    var x:MutableMap<Int,Int> =mutableMapOf(9 to 16,10 to 17)
    f.putAll(x)
    println("${f[4]}")
    for(k in f.keys){
        print("${k} ->")
        println("${f[k]}")
    }
}