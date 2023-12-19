public class Node {

    int share;
    int price;

    public Node next;

    public Node(int share, int price, Node next) {
        this.share = share;
        this.price = price;
        this.next = next;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
