/*
    ArrayList implementation of Stack
 */

import java.util.ArrayList;

public class ArrayList_Stack {

    static class Stack {

        static ArrayList<Integer> arrayList = new ArrayList<>();

        //method to check if the stack is empty
        public static boolean isEmpty() {
            return (arrayList.isEmpty());
        }

        // method to peek into the stack
        public static int Peek() {
            if (isEmpty()) {
                return -1;
            }
            // return the top element
            return arrayList.get(arrayList.size() - 1);
        }

        // method to add to the top of the stack
        public static void Push(int data) {
            arrayList.add(data);
        }

        // method to remove the top element in stack
        public static int Pop() {
            if (isEmpty()) {
                return -1;
            }
            return arrayList.remove(arrayList.size() - 1);
        }

    }


}
