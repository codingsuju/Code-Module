//Working with String Array
fun main() {
   var x =Array(2){arrayOfNulls<String>(3)}
   x[0][0]="Hello"
   x[0][2]=""
   for(i in 0 until x.size){
       for(j in 0 until x[0].size){
           var s:String? = x[i][j]
           if(s != null && s.length >0){
               print("${s} ")
           }
           else if(x[i][j]==null){
               print("null ")
           }
           else
                print("Empty")
       }
       println("")
   }
   change(x)
   println("")
   println("After calling change function")
   for(i in 0 until x.size){
       for(j in 0 until x[0].size){
           var s:String? = x[i][j]
           if(s != null && s.length >0){
               print("${s} ")
           }
           else if(x[i][j]==null){
               print("null ")
           }
           else
                print("Empty")
       }
       println("")
   }
}
fun change(x:Array<Array<String?>>):Boolean{
    x[1][1]="Changed"
    return true
}