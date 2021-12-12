//Initializing 2D Array with some Values
fun main() {
   var x = Array(3){Array(4){0}}
   println("x with initial values 10")
   for(i in 0..(x.size)-1){
       for(j in 0..(x[0].size)-1){
           print("${x[i][j]} ")
       }
       println("")
   }
   var y = Array(3){IntArray(4){10}}
   println("y with initial values 10")
   for(i in 0..(y.size)-1){
       for(j in 0..(y[0].size)-1){
           print("${y[i][j]} ")
       }
       println("")
   }
}