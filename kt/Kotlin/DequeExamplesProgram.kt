import 	java.util.*
class LiveList(var x1:Int, var x2:Int)
fun main() {
    var dq = ArrayDeque<LiveList>()
    dq.addLast(LiveList(2,10))
    dq.addFirst(LiveList(3,10))
    dq.addFirst(LiveList(7,11))
    dq.addFirst(LiveList(4,9))
    while(!dq.isEmpty()){
        print("[${dq.first().x1} ,${dq.first().x2}] ")
        dq.removeFirst()
    }
}