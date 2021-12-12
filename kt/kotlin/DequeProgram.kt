import 	java.util.*
class LiveList(var x1:Int, var x2:Int)
fun main() {
    var dq = ArrayDeque<Int>()
    dq.addLast(4)
    dq.addFirst(10)
    dq.addLast(3)
    dq.addLast(12)
    dq.addFirst(2)
    println(dq)
    dq.removeFirst()
    println(dq)
}