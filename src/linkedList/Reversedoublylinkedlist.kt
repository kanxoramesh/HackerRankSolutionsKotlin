package linkedList

import java.lang.Exception
import kotlin.io.*

class DoublyLinkedListNode(nodeData: Int) {
    public var data: Int
    public var next: DoublyLinkedListNode?
    public var prev: DoublyLinkedListNode?

    init {
        data = nodeData
        next = null
        prev = null
    }
}

class DoublyLinkedList {
    public var head: DoublyLinkedListNode?
    public var tail: DoublyLinkedListNode?

    init {
        head = null
        tail = null
    }

    public fun insertNode(nodeData: Int) {
        var node = DoublyLinkedListNode(nodeData)

        if (head == null) {
            head = node
        } else {
            tail?.next = node
            node?.prev = tail
        }

        tail = node
    }

}

fun printDoublyLinkedList(head: DoublyLinkedListNode?, sep: String) {
    var node = head;

    while (node != null) {
        print(node?.data)
        node = node?.next

        if (node != null) {
            print(sep)
        }
    }
}

// Complete the reverse function below.

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     data: Int
 *     next: DoublyLinkedListNode
 *     prev: DoublyLinkedListNode
 * }
 *
 */
fun reverse(llist: DoublyLinkedListNode?): DoublyLinkedListNode? {


    var current: DoublyLinkedListNode? = llist
    var next: DoublyLinkedListNode? = null

    while (current != null) {
        val temp = current.prev
        current.prev = current.next
        current.next = temp
        next = current
        current = current.prev
    }
    return next
}

fun main(args: Array<String>) {


}