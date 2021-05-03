package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.*;

/*
 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 *
 */

public class UseQueue<waitingQueue> {

    public static void main(String[] args) {
        // Create and initialize a Queue using a LinkedList
        Queue<String> waitingQueue = new LinkedList<>();

        // Adding new elements to the Queue (The Enqueue operation)
        waitingQueue.add("Thamina");
        waitingQueue.add("Tanzina");
        waitingQueue.add("Farzin");
        waitingQueue.add("Shadman");
        waitingQueue.add("Julia");
        waitingQueue.add("Daniyal");
        waitingQueue.add("Adeel");

        System.out.println("WaitingQueue : " + waitingQueue);

        //access via Iterator While loop
        System.out.println("********************************************************");
        System.out.println("Access Queue elements via Iterator and While loop: ");
        Iterator<String> iterator = waitingQueue.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Name in Queue : " + element);
        }

        //access via For Each loop
        System.out.println("********************************************************");
        System.out.println("Access Queue elements via For Each loop: ");
        for (String element : waitingQueue) {
            System.out.println("Name in Queue : " + element);
        }

        // Removing an element from the Queue using poll() (The Dequeue operation)
        // The poll() method will return null, if the Queue is empty
        System.out.println("********************************************************");
        String name = waitingQueue.poll();
        System.out.println("Removed from WaitingQueue by poll() function : " + name + " | New WaitingQueue : " + waitingQueue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        System.out.println("********************************************************");
        try {
            name = waitingQueue.remove();
            System.out.println("Removed from WaitingQueue by remove() function : " + name + " | New WaitingQueue : " + waitingQueue);
        } catch (NoSuchElementException exp) {
            System.out.println("Queue is empty");
        }

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        System.out.println("********************************************************");
        String firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("First Person in the Waiting Queue by peek() function: " + firstPersonInTheWaitingQueue);


        // element() returns the first element from the Queue without taking it out of Queue
        // will throw a "NoSuchElementException" if Queueis empty
        try {
            firstPersonInTheWaitingQueue = waitingQueue.element();
            System.out.println("First Person in the Waiting Queue by element() function : " + firstPersonInTheWaitingQueue);
        } catch (NoSuchElementException exp) {
            System.out.println("Queue is empty");

        }
    }
}









