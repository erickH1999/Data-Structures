// Erick Huerta

/*
    This Java program calculates the total capital gain or loss for a sequence of stock transactions
     using the FIFO (First In, First Out) protocol. The goal is to identify which shares are sold when
     multiple shares have been bought over time. The program uses a linked list to manage the
     transactions and implements the FIFO principle for determining the shares sold.
 */

public class Capital_Main {

    public static void main(String[] args) {

      Capital_LL list = new Capital_LL();

      //inputs
        list.addLast(100, 20);
        list.addLast(20, 24);
        list.addLast(200, 36);
        list.addLast(-150, 30);

        System.out.println(list.getGain());


    }

}
