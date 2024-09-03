class Solution {
    
    static class Node<E> {
        E item;
        Node<E> next;
        
        Node(E newItem) {
            item = newItem;
            next = null;
        }
        
        Node(E newItem, Node<E> nextNode) {
            item = newItem;
            next = nextNode;
        }
    }
    
    static class LinkedList<E> {
        private Node<E> head;
        private int numItems;
        
        LinkedList() {
            head = new Node<>(null, null);
            numItems = 0;
        }
        
        public void add(int index, E item) {
            if (index >= 0 && index <= numItems) {
                Node<E> prevNode = getNode(index-1);
                Node<E> newNode = new Node<>(item, prevNode.next);
                prevNode.next = newNode;
                numItems++;
            }
        }
        
        public Node getNode(int index) {
            if (index >= -1 && index < numItems) {
                Node<E> currNode = head;
                for (int i=0; i<=index; i++) {
                    currNode = currNode.next;
                }
                return currNode;
            }
            return null;
        }
        
        static final int NOT_FOUND = -12345;
        public int indexOf(E item) {
            Node<E> currNode = head;
            for (int i=0; i<numItems; i++) {
                currNode = currNode.next;
                if (((Comparable)(currNode.item)).compareTo(item) == 0) {
                    return i;
                }
            }
            return NOT_FOUND;
        }
        
        public int len() {
            return numItems;
        }
        
        public boolean isEmpty() {
            return numItems == 0;
        }
    }
    
    static class ChainHashTable {
        private LinkedList<Integer>[] table;
        private int numItems;
        
        ChainHashTable(int n) {
            table = (LinkedList<Integer>[]) new LinkedList[n];
            for (int i=0; i<n; i++) {
                table[i] = new LinkedList<>();
            }
            numItems = 0;
        }
        
        private int hash(Integer x) {
            return x % table.length;
        }
        
        public Node search(Integer x) {
            int slot = hash(x);
            if (table[slot].isEmpty()) {
                return null;
            }
            else {
                int i = table[slot].indexOf(x);
                if (i == LinkedList.NOT_FOUND) {
                    return null;
                }
                else {
                    return table[slot].getNode(i);
                }
            }
        }
        
        public void insert(Integer x) {
            int slot = hash(x);
            if (search(x) == null) {
                table[slot].add(0, x);
                numItems++;
            }
        }
        
        public int getItems() {
            int sum = 0;
            for (int i=0; i<table.length; i++) {
                for (int j=0; j<table[i].len(); j++) {
                    if (sum == table.length/2) {
                        break;
                    }
                    sum++;
                }
            }
            return sum;
        }
    }
    
    public int solution(int[] nums) {
        ChainHashTable hash = new ChainHashTable(nums.length);
        for (int i : nums) {
            hash.insert(i);
        }
        int answer = hash.getItems();
        return answer;
    }
}