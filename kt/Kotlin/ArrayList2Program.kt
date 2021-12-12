//ArrayList 2
fun main(){
     var x = arrayListOf(arrayListOf(3,4),arrayListOf(2,1),arrayListOf(9,10))
     println(x)
     var y= x.toArray()
     var s:Int= y.size
     println("$s")
     for(i in 0..(y.size-1)){
         println(y[i])
     }
}