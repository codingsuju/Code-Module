// Priority Queue from Java framework
import 	java.util.*
class LiveList(var x1:Int, var x2:Int)
class CustomComparator: Comparator<LiveList>{
    override fun compare(o1: LiveList, o2:LiveList): Int =when {
        o1.x1==o2.x1 -> {
          o1.x2.compareTo(o2.x2)
        }
        else -> o1.x1.compareTo(o2.x1)
    }
}
fun main() {
   val x=CustomComparator()
   var pq= PriorityQueue<LiveList>(x)
   pq.offer(LiveList(4,5))
   pq.offer(LiveList(7,8))
   pq.offer(LiveList(4,6))
   pq.offer(LiveList(2,6))
   pq.offer(LiveList(4,3))
   pq.offer(LiveList(7,3))
   pq.offer(LiveList(7,3))
   pq.offer(LiveList(7,2))
   pq.offer(LiveList(7,10))
   while(!pq.isEmpty()){
       var liveList:LiveList=pq.peek()
       pq.poll()
       print("[${liveList.x1},${liveList.x2}]")
       
   }
}
