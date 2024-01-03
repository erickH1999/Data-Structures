/*
    Java class handling the different methods of Queue with Arraylists
 */

import java.util.ArrayList;

public class Queue_Array {

    ArrayList<Integer> Queue = new ArrayList<>();

    // add an element to the back of the list
    public void enqueue(int value) {
        Queue.add(value);
    }

    // remove en element on the front of the list
    public int dequeue() throws Exception {
        if (Queue.isEmpty()) {
            throw new Exception("The queue is empty!");
        }
        return Queue.remove(0);
    }

    // return the value at the front of the list
    public int front() throws Exception{
        if (Queue.isEmpty()) {
            throw new Exception("The queue is empty!!");
        }
        return Queue.get(0);
    }

}
