import java.util.ArrayList;

public class LinkedTree {

    Node root;

    public void addNode(String nameParent, String nameChild) throws Exception {

        Node newNode = new Node(nameChild);

        if (root == null) {
            root = newNode;
        } else {

            // find the parent node
            Node parentNode = findNode(nameParent, root);

            if (parentNode == null) {
                throw new Exception("Parent should not be null");
            }

            // add a child to the parent node
            parentNode.addNode(newNode);

        }

    }

    public Node findNode(String name, Node currentRoot) {

        if (currentRoot == null) {
            return null;
        } else if (currentRoot.name.equalsIgnoreCase(name)) {
            return currentRoot;
        }

        for (int index = 0; index < currentRoot.list.size(); index++) {
            Node child = findNode(name, currentRoot.list.get(index));

            if (child != null) {
                return child;
            }
        }
        return null;
    }

    public void preorderTraverse(Node node) {

        if (node == null) {
            return;
        }

        System.out.println(node.name);

        for (int index = 0; index < node.list.size(); index++) {
            preorderTraverse(node.list.get(index));
        }

    }

    public void preorderTraverse() {
        preorderTraverse(root);
    }


    private class Node {

        String name;
        // holds the list of family members

        ArrayList<Node> list = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public void addNode(Node member) {
            list.add(member);
        }

    }

}



