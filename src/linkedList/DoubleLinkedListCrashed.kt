import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

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

// Complete the sortedInsert function below.

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
fun sortedInsert(ls: DoublyLinkedListNode?, data: Int): DoublyLinkedListNode? {

    var head=ls

    val newNode = DoublyLinkedListNode(data)
    var current: DoublyLinkedListNode?

    // if list is empty

    // if list is empty
    if (head == null) head = newNode else if (head.data >= newNode.data) {
        newNode.next = head
        newNode.next!!.prev = newNode
        head = newNode
    } else {
        current = head

        // locate the node after which the new node
        // is to be inserted
        while (current!!.next != null &&
            current.next!!.data < newNode.data
        ) current = current.next

        /* Make the appropriate links */newNode.next = current.next

        // if the new node is not inserted
        // at the end of the list
        if (current.next != null) newNode.next!!.prev = newNode
        current.next = newNode
        newNode.prev = current
    }
    return head

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val llistCount = scan.nextLine().trim().toInt()
        val llist = DoublyLinkedList()

        for (i in 0 until llistCount) {
            val llist_item = scan.nextLine().trim().toInt()
            llist.insertNode(llist_item)
        }

        val data = scan.nextLine().trim().toInt()

        val llist1 = sortedInsert(llist?.head, data)

        printDoublyLinkedList(llist1, " ")
    }
}
