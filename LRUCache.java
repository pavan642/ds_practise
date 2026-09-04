import java.util.Arrays;
import java.util.List;

public class LRUCache {

    public static final int size = 3;

    static class Node {
        Integer key;
        Node prev;
        Node next;

        public Node(Integer key) {
            this.key = key;
        }
    }

    public static void printCache(Node node){
        while(node != null){
            System.out.print(node.key + " ");
            node = node.next;
        }
    }

    public static Integer get(Node node, Integer key) {
        while(node.next != null){
            if(node.key.equals(key)){
                return key;
            }
        }
        return null;
    }

    public static void put(Node node, Integer key) {
        int nodeSize = 0;
        Node currNode = node;
//        while(currNode.next != null){
//            nodeSize++;
//            currNode = currNode.next;
//        }
//
//        if(nodeSize == size){
//            System.out.println("Size is full");
//            return;
//        }
        currNode = node;
        Boolean isKeyFound = false;
        Node lastNode = null;
        while(currNode.next != null){
            //find in between node move it front and link the node
            if(currNode.key.equals(key)){
                Node prevNOde = currNode.prev;
                Node tempNode = currNode;
                prevNOde.next = currNode.next;
                currNode.next.prev = prevNOde;

                tempNode.next = node;
                node.prev = tempNode;
                isKeyFound = true;
            }
            lastNode = currNode;
            currNode = currNode.next;
        }
        if(!isKeyFound){
            if (lastNode !=null && lastNode.prev != null) {
                lastNode.prev.next = null; // remove from last
            }

            Node newNode = new Node(key); // add at the start
            newNode.next = node;
//            return newNode;
        }
    }

    public static void main(String[] args){

        Node n1 = new Node(1);
        LRUCache.put(n1, 2);
        printCache(n1);
//        LRUCache.put(n1, 3);
//        LRUCache.put(n1, 2);
//        LRUCache.put(n1, 5);
//        printCache(n1);
//
//        Integer result = LRUCache.get(n1, 3);
//        System.out.println(result);
//        printCache(n1);


//        List<Integer> input = Arrays.asList(1,3,4,2,5,3,4,1,7,8,3,9);
//        implLRUCache(input);

    }
}
