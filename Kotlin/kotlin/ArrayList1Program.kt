//ArrayList 1
fun main(){
     var x=arrayListOf(3,4,6,3)
     x.add(2,7)
     println(x)
     x.remove(3)
     println(x)
     x.removeAt(2)
     println(x)
     x.add(10)
     var y= x.toArray()
     for(e in y)
      print("$e ")
     println("")
     y[0]=16
     println(x)
     
}