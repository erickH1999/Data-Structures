// Erick Huerta

/*
    Java implementation of the Queue Data Structure with ArrayLists
 */

public class Main {
    public static void main(String[] args) throws Exception {

        Queue_Array queueArray = new Queue_Array();


        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        queueArray.enqueue(4);
        queueArray.enqueue(5);

        // show the first element of the array
        System.out.println("The first element of the array: " + queueArray.front());

        System.out.println("The element that will be removed: " + queueArray.dequeue());

        System.out.println("The new element at the front: " + queueArray.front());


    }
}