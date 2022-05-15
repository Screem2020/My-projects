package DataStructure.TreeMap;


import java.util.ArrayDeque;

//class Test<K extends Integer, V extends User> {
//    K k;
//    V v;
//
//    public Test(K k) {
//
//        this.k = k;
//    }
//
//    public Test(V v) {
//        this.v = v;
//    }
//}

public class MyBeenaryWidth {
    public static void main(String[] args) {
        MyBeenaryTree<Integer, Integer> integerStringMyBeenaryTree = new MyBeenaryTree<>();

        integerStringMyBeenaryTree.addWidth(2, 2);
        integerStringMyBeenaryTree.addWidth(4, 2);
        integerStringMyBeenaryTree.addWidth(1, 2);
        integerStringMyBeenaryTree.addWidth(5, 2);
        integerStringMyBeenaryTree.addWidth(3, 2);
        integerStringMyBeenaryTree.printWidth();
    }

    static class MyBeenaryTree<K extends Comparable<K>, V extends Comparable<V>> {
        private int size;
        private Node root;

        private class Node {
            K k;
            V v;
            Node leftNode;
            Node rightNode;

            public Node(K k, V v, Node leftNode, Node rightNode) {
                this.k = k;
                this.v = v;
                this.leftNode = leftNode;
                this.rightNode = rightNode;
            }

            public Node(K k, V v) {
                this.k = k;
                this.v = v;
            }

            public Node(K k) {
                this.k = k;
            }


            @Override
            public String toString() {
                return "Node{" +
                        "k=" + k +
                        ", v=" + v +
                        ", leftNode=" + leftNode +
                        ", rightNode=" + rightNode +
                        '}';
            }
        }


        private boolean containsRecurs(Node currentNode, Node kvNode) {
            if (kvNode.k.compareTo(currentNode.k) > 0) {
                if (currentNode.rightNode != null) {
                    return containsRecurs(currentNode.rightNode, kvNode);
                } else return false;
            } else if (kvNode.k.compareTo(currentNode.k) < 0) {
                if (currentNode.leftNode != null) {
                    return containsRecurs(currentNode.leftNode, kvNode);
                } else return false;

            } else {
                return true;
            }
        }

        public int getSize() {
            return size;
        }

        public void addWidth(K k, V v) {
            Node node = new Node(k, v);
            if (getSize() <= 0) {
                root = node;
            } else addWidth(node);
            size++;
        }

        private void addWidth(Node newNode) {
            Node currentNode = root;
            while (currentNode != null) {
                if (newNode.k.compareTo(currentNode.k) > 0) {
                    if (currentNode.rightNode == null) {
                        currentNode.rightNode = newNode;
                        currentNode = null;

                    } else {
                        currentNode = currentNode.rightNode;

                    }
                } else {
                    if (currentNode.leftNode == null) {
                        currentNode.leftNode = newNode;
                        currentNode = null;

                    } else {
                        currentNode = currentNode.leftNode;
                    }
                }

            }
        }

//        private void addWidth(Node newNode) {
//            ArrayDeque<Node> q = new ArrayDeque<>();
//            q.add(root);
//            while (q.size() > 0) {
//                Node currentNode = q.poll();
//
//                if (newNode.k.compareTo(currentNode.k) > 0) {
//                    if (currentNode.rightNode == null) {
//                        currentNode.rightNode = newNode;
//
//                    } else {
//                        q.add(currentNode.rightNode);
//                    }
//                } else {
//                    if (currentNode.leftNode == null) {
//                        currentNode.leftNode = newNode;
//
//                    } else {
//                        q.add(currentNode.leftNode);
//                    }
//                }
//
//            }
//        }


        private boolean containsVWidth(K k, V v) {
            Node node = new Node(k, v);
            ArrayDeque<Node> vs = new ArrayDeque<>();
            vs.add(root);
            while (vs.size() > 0) {
                Node nodeCurrent = vs.poll();
                if (node.v.compareTo(nodeCurrent.v) > 0) {
                    return true;
                }
                if (nodeCurrent.leftNode != null) vs.add(nodeCurrent.leftNode);
                if (nodeCurrent.rightNode != null) vs.add(nodeCurrent.rightNode);
            }
            return false;
        }

        public void printWidth() {
            ArrayDeque<Node> node = new ArrayDeque<>();
            node.add(root);
            while (node.size() > 0) {
                Node currntNode = node.poll();
                System.out.println(currntNode.k);
                if (currntNode.leftNode != null) node.add(currntNode.leftNode);
                if (currntNode.rightNode != null) node.add(currntNode.rightNode);

            }
        }


//        private boolean containsRecurs(Node currentNode, Node kvNode) {
//
//            if (currentNode == null) {
//                return false;
//            }
//            if (kvNode.k.compareTo(currentNode.k) > 0) {
//                return containsRecurs(currentNode.rightNode, kvNode);
//            }
//            else if (kvNode.k.compareTo(currentNode.k) < 0) {
//                return containsRecurs(currentNode.leftNode, kvNode);
//            }else{
//                return true;
//            }
//
//        }
        //########################### end #############################

//        public boolean contains(K k) {
//            Node kvNode = new Node(k);
//            if (getSize() <= 0) {
//                return false;
//            } return containsRecurs(root, kvNode);
//        }

        //        private boolean containsRecurs(Node current, Node newNode) {
//            if (current != null) {
//                if (current.leftNode != null) {
//                    if (newNode.k.compareTo(current.k) == 0) return true;
//                    else containsRecurs(current.leftNode, newNode);
//                }
//                if (current.rightNode != null) {
//                    if (newNode.k.compareTo(current.k) == 0) return true;
//                    else containsRecurs(current.rightNode, newNode);
//                }
//            }
//            return false;
//    }

//        private int containsRecurs(Node currentNode, Node kvNode) {
//            int b = 0;
//            if (currentNode != null) {
//                if (currentNode.rightNode != null) {
//                    containsRecurs(currentNode.rightNode, kvNode);
//                }
//                System.out.println("ok");
//                b = kvNode.k.compareTo(currentNode.k);
//                if (currentNode.leftNode != null) {
//                    containsRecurs(currentNode.leftNode, kvNode);
//                }
//            }
//            return b;
//        }


//  private boolean containsRecures(Node current, Node newCurrent) {
//            if (current == null) {
//                return false;
//            }
//            if (newCurrent.k.compareTo(current.k) < 0) {
//                return containsRecures(current.leftNode, newCurrent);
//            } else if (newCurrent.k.compareTo(current.k) > 0) {
//                return containsRecures(current.rightNode, newCurrent);
//            } else return true;
//        }


    }
}
