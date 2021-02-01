package linkedList

class MyNode(var nodeData: Int) {
    public var next: MyNode? = null
}

class LinkedList {


    var head: MyNode? = null
    var tail: MyNode? = null


    fun addNode(data: Int) {
        var nodeData = MyNode(data)

        if (head == null) {
            head = nodeData
        } else
            tail?.next = nodeData

        tail = nodeData
    }


}

fun findMergePoint(head1: MyNode, head2: MyNode) {

    var temp1: MyNode? = head1
    var temp2: MyNode? = head2

    while (temp1?.nodeData != temp2?.nodeData) {
        if (temp1?.next == null) {
            temp1 = head2
        } else
            temp1 = temp1?.next

        if (temp2?.next == null) {
            temp2 = head1
        } else
            temp2 = temp2?.next
    }

    print(temp2?.nodeData)
}


public fun main() {
    var list1 = LinkedList()
    var list2 = LinkedList()
    list1.addNode(2)
    list1.addNode(6)
    list1.addNode(9)
    list1.addNode(78)


    list2.addNode(29)
    list2.addNode(5)
    list2.addNode(89)
    list2.addNode(899)
    list2.addNode(67)
    list2.addNode(0)
    list2.addNode(78)
    findMergePoint(list1.head!!, list2.head!!)

}

