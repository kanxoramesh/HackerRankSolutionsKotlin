import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

class SinglyLinkedListNode(nodeData: Int) {
    public var data: Int
    public var next: SinglyLinkedListNode?

    init {
        data = nodeData
        next = null
    }
}


class SinglyLinkedList {
    public var head: SinglyLinkedListNode?
    public var tail: SinglyLinkedListNode?

    init {
        head = null
        tail = null
    }

    //  head:(2,null)
    //tail: (2,null)

    public fun insertNode(nodeData: Int) {
        var node = SinglyLinkedListNode(nodeData)


        // node is pass by reference

        if (head == null) {
            head = node
        } else {
            tail?.next = node
        }
        System.out.println("Head data: " + head?.data)
        System.out.println("Head next data :" + head?.next?.data)
        tail = node
        System.out.println("Tail data: " + tail?.data);
        System.out.println("Head next data :" + head?.next?.data)

    }

}

fun printSinglyLinkedList(head: SinglyLinkedListNode?, sep: String) {
    var node = head;

    while (node != null) {
        print(node?.data)
        node = node?.next

        if (node != null) {
            print(sep + " ")
        }
    }
}

// Complete the insertNodeAtPosition function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     data: Int
 *     next: SinglyLinkedListNode
 * }
 *
 */
fun insertNodeAtPosition(llist: SinglyLinkedListNode?, data: Int, position: Int):
        SinglyLinkedListNode? {

    var addData = SinglyLinkedListNode(data)
    var tempPosition = 0
    var head = llist
    var tempNode = head
    var prevNode = tempNode
    while (tempNode?.next != null && tempPosition < position) {

        tempPosition++;
        prevNode = tempNode
        tempNode = tempNode.next

    }

    if (tempNode == llist) {  // if head and temp head is same mean loop isn't run
        var temp = head
        addData.next = temp
        head = addData

    } else {

        prevNode?.next = addData
        addData?.next = tempNode

    }
    return head


}

fun getNodeAt(head: SinglyLinkedListNode?, position: Int): SinglyLinkedListNode? {

    var tempNode = head
    var count = 0

    while (tempNode != null && count < position) {
        tempNode = tempNode.next
        count++

    }
    return tempNode

}

fun main(args: Array<String>) {
    var list = SinglyLinkedList()
    list.insertNode(16)
    list.insertNode(13)
    list.insertNode(7)
    var a = insertNodeAtPosition(list.head, 1, 3)
    print("at pos: "+getNodeAt(list.head, 0)?.data)
}