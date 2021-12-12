// Custom sort on Array
val check=fun(a:Array<Int>,b:Array<Int>):Int{
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
   var x = arrayOf(arrayOf(4,3),arrayOf(3,4),arrayOf(3,6))
   x.sortWith(check)
   for(i in 0..2){
       for(j in 0..1){
           print("${x[i][j]} ")
       }
       println("")
   }
}