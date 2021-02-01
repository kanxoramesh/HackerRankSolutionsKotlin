package linkedList

class LinkedListCrash {

    private var head: Node? = null
    private var tail: Node? = null

    inner class Node(var data: Int) {

        var next: Node?

        init {
            this.next = null
        }

    }

    fun addNode(data: Int) {

        var node = Node(data)

        if (head == null) {
           // node.next = node
            head = node;
        } else {
            tail?.next = node
        }
        tail = node

    }

    public fun getLenght(): Int {
        var temp = head
        var length = 0
        while (temp?.next != null) {
            temp = temp.next
            length++
        }
        return length + 1
    }


    fun insertNodeAt(position: Int, data: Int) {
        var length = getLenght()
        var prevNode = head
        var tempNode = head
        if (position > length) {
            throw ArrayIndexOutOfBoundsException("Not found")
        }
        var tempPosition = 0
        while (tempNode?.next != null && tempPosition < position) {


            prevNode = tempNode
            tempNode = tempNode.next
            tempPosition++

        }

        //add node at tempPostion
        var addNode = Node(data)
        addNode.next = tempNode
        prevNode?.next = addNode

    }

    fun getNodeDataAt(position: Int): Int? {
        var length = getLenght()
        var tempNode = head

        if (position > length) {
            throw ArrayIndexOutOfBoundsException("Not found")
        }
        var tempPosition = 0
        while (tempNode?.next != null && tempPosition < position) {


            tempNode = tempNode.next
            tempPosition++

        }
        return tempNode?.data

    }
}

fun main() {
    var list = LinkedListCrash()
    list.addNode(20)
    list.addNode(30)
    list.addNode(60)
    list.addNode(67)
    list.addNode(10)
    list.insertNodeAt(1, 333)
    println(list.getNodeDataAt(6))
    println(list.getLenght())

}