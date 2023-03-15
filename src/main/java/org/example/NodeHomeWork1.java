package org.example;

import static org.example.Node.isNodeExist;

public class NodeHomeWork1 {
    public Node left;
    public Node right;git commit -m "HomeWork"
    public Integer value;

    private static boolean isNodeExist(Node node) {
        return node != null && node.value != null;
    }

    //todo
    private static Node search(Node node, int value) {
        if (!isNodeExist(node)) {
            return null;
        } else if (value == node.value) {
            System.out.println(node.value);
        }
        return node;
    }
    //todo
    private static Node getMax (Node node){
        if (!isNodeExist(node)) {
            return null;
        }
        if (!isNodeExist(node.right)) {
            return node;
        }
        return getMax(node.right);
    }

    //todo
    private static void directOrderTraversal (Node node){
        if (!isNodeExist(node)) {
            return;
        }
        System.out.println("[" + node.value + "]");
        System.out.println("[" + node.left + "]");
        System.out.println("[" + node.right + "]");
    }

    //todo
    private static void postOrderTraversal (Node node){
        if (!isNodeExist(node)) {
            return;
        }
        postOrderTraversal(node.right);
        System.out.println("[" + node.value + "]");
        postOrderTraversal(node.left);
    }

}
