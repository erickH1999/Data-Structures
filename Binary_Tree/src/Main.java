// Erick Huerta

/*
    A Java implementation of a Binary Tree where a family tree is displayed

    This was an assignment I had done for my data structures class where I implemented
    a Binary Tree using Array Lists
 */

public class Main {
    public static void main(String[] args) throws Exception {

        LinkedTree tree = new LinkedTree();

        System.out.println("The tree of people is displayed in an inorder pattern: ");

        tree.addNode("", "Grandpa Joe");
        tree.addNode("Grandpa Joe", "Johnny");
        tree.addNode("Grandpa Joe", "diego");

        System.out.println();

        tree.addNode("Johnny", "Joseph");
        tree.addNode("Johnny", "Joe mama");

        tree.preorderTraverse();

    }
}