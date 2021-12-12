// Custom Sort on Mutable List
val check=fun(a:MutableList<Int>,b:MutableList<Int>):Int{
    if(a[0]==b[0]){
       if(a[1]==b[1])
        return 0
       else if(a[1]<b[1])
        return -1
       else
        return 1
    }
    else if(a[0]<b[0])
       return -1
    else
       return 1
}
fun main() {
   var x:MutableList<MutableList<Int>> =mutableListOf(mutableListOf(4,3),mutableListOf(3,4),mutableListOf(3,6))
   println(x)
   x.sortWith(check)
   println(x)
} 
