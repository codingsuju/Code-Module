// lower_bound and upper_bound 
fun lower_bound(list:MutableList<Int>, x:Int):Int{
    var n:Int =list.size
    var ans:Int =-1
    if(list[0] > x){
        ans=0
        return ans
    }
    if(list[n-1]< x){
        ans=n
        return ans
    }
    var low:Int=0
    var high:Int=n-1
    while(low<=high){
        var mid:Int =(low+high)/2
        if(list[mid]>=x){
            ans=mid
            high=mid-1
        }
        else{
            low=mid+1
        }
    }
    return ans
}
fun upper_bound(list:MutableList<Int>,x:Int):Int{
    return lower_bound(list,x+1)
}
fun main() {
    var list=mutableListOf(1,6,4,1,23,10,38,3,37,6,6,7,2,10,9,19,20,21,10)
    list.sort()
    println(list)
    var l:Int =lower_bound(list,6)
    var r:Int =upper_bound(list,6)
    println("${l}")
    println("${r}")
} 