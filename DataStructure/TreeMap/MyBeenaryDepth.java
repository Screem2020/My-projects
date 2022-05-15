package DataStructure.TreeMap;

public class MyBeenaryDepth {
    public static void main(String[] args) {
        TreeMap<Integer, String> ism = new TreeMap<>();
        ism.addNode(2, "ARR1rqw");
        ism.addNode(3, "ARR2wrq");
        ism.addNode(2, "ARR");
        ism.addNode(4, "ARRqewrq");
        ism.addNode(1, "ARRw");
        System.out.println(ism.containsK(2));
        System.out.println(ism.containsK(10));
        ism.print();
        System.out.println();
        System.out.println(ism.containsV("ARRqewrq"));
    }
}

class TreeMap <K extends Comparable<K>, V extends Comparable<V>> {
    private int size;
    private Node root;

    public class Node {
        K k;
        V v;
        Node leftNode;
        Node rightNode;

        public Node(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public Node(K k) {
            this.k = k;
        }
    }

    public int getSize() {
        return size;
    }

    public void addNode(K k, V v) {
        Node newNode = new Node(k, v);
        if (size <= 0) {
            root = newNode;
        } else addRecurs(newNode, root);
        size++;
    }

    private void addRecurs(Node newNode, Node current) {
        if (newNode.k.compareTo(current.k) > 0) {
            if (current.rightNode == null) current.rightNode = newNode;
            else addRecurs(newNode, current.rightNode);
        } else if (current.leftNode == null) current.leftNode = newNode;
        else addRecurs(newNode, current.leftNode);
    }

    public boolean containsV(V v) {
        K k = null;
        Node node = new Node(k, v);
        if (getSize() <= 0) {
            return false;
        }
        return depthRecurs(node, root);
    }

    private boolean depthRecurs(Node newNode, Node current) {
        if (newNode.v.compareTo(current.v) < 0) {
            if (current.leftNode != null) {
                return depthRecurs(newNode, current.leftNode);
            } else return false;
        } else if (newNode.v.compareTo(current.v) > 0) {
            if (current.rightNode != null) {
                return depthRecurs(newNode, current.rightNode);
            } else return false;
        } else return true;
    }

    public void print() {
        if (size <= 0) return;
        printRecurs(root);
    }

    private void printRecurs(Node currentNode) {
        if (currentNode != null) {
            if (currentNode.leftNode != null) {
                printRecurs(currentNode.leftNode);
            }
            System.out.print(currentNode.k);
            System.out.print(" ");
            System.out.println(currentNode.v);
            if (currentNode.rightNode != null) {
                printRecurs(currentNode.rightNode);
            }
        }
    }

    public boolean containsK(K k) {
        Node node = new Node(k);
        if (getSize() < 0) return false;
        else return depthKRecurs(node, root);
    }

    private boolean depthKRecurs(Node newNode, Node currentNode) {
        if (currentNode == null) {
            return false;
        }
        if (newNode.k.compareTo(currentNode.k) > 0) {
            return depthKRecurs(newNode, currentNode.leftNode);
        } else if (newNode.k.compareTo(currentNode.k) < 0) {
            return depthKRecurs(newNode, currentNode.rightNode);
        } else return true;
    }

    public boolean containsV(K k, V v) {
        Node node = new Node(k, v);
        if (getSize() <= 0) {
            return false;
        } else {
            int i = containsRecV(root, node);
            return i > 0;
        }
    }

    private int containsRecV(Node current, Node newNode) {
        int i = 0;
        int d = 0;
        if (current != null) {
            if (current.leftNode != null) {
                d = containsRecV(current.leftNode, newNode);
            }
            if (d > 0) return d;
            i = newNode.v.compareTo(current.v);
            if (current.rightNode != null) {
                d = containsRecV(current.rightNode, newNode);
            }
            if (d > 0) return d;

        }
        return i;
    }
}
