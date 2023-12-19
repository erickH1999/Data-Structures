/*
    Linked list for capital gain/loss project
 */

//import org.w3c.dom.Node;

public class Capital_LL {

    private Node head;

    private Node tail;

    private int size;


    public Capital_LL() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // add element "e" to the end of the list:
    public void addLast(int share, int price) {

        Node newest = new Node(share, price, null);

        if (isEmpty()) {
            head = newest;
            tail = newest;
            size++;
        } else {
            tail.setNext(newest);
            tail = newest;
            size++;
        }
    }

    public int getGain() {

        Node firstShare = head;

        int totalGain = 0;

        for (Node current = head; current != null; current = current.next) {

            if (current.share < 0) {

                while (firstShare != current) {

                    if (firstShare.share < 0) {
                        continue;
                    }

                    int gain_per_share = current.price - firstShare.price;

                    if (firstShare.share <= -current.share) {
                        current.share += firstShare.share;

                        totalGain += gain_per_share * firstShare.share;

                        head = firstShare.next;
                        firstShare = head;
                    } else {
                        firstShare.share += current.share;
                        totalGain += gain_per_share * -current.share;
                        break;
                    }

                }

            }

        }
        return totalGain;
    }

}

