// Erick Huerta

/*
    Main class to test different implementations
    of the Stack data structure.

    This version of stack is implemented using Array Lists
 */

public class Main {
    public static void main(String[] args) {


        ArrayList_Stack.Stack.Push(1);
        ArrayList_Stack.Stack.Push(2);
        ArrayList_Stack.Stack.Push(3);
        ArrayList_Stack.Stack.Push(4);

        // print while the list is full
        // prints in descending order
        while (!ArrayList_Stack.Stack.isEmpty()) {
            System.out.println(ArrayList_Stack.Stack.Peek());

            ArrayList_Stack.Stack.Pop();
        }


    }
}