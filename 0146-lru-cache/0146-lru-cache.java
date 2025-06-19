class Node{
    int key,value;
    Node prev,next;
    
    Node(int _key,int _val){
        this.key=_key;
        this.value=_val;
    }
}

class LRUCache {
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    Map<Integer,Node> mp =new HashMap<>();
    int capacity;

    public void insert(Node node){
        
        mp.put(node.key,node);
        node.next=head.next;
        head.next.prev=node;
        node.prev=head;
        head.next=node;
    }
    public void remove(Node node){
        mp.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

     

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
          Node node=mp.get(key);
          remove(node);//first remove than insert
          insert(node);
          return node.value;
        }else
        return -1;
    }
    
    public void put(int key, int value) {
        

        if(mp.containsKey(key))
        remove(mp.get(key));
        else if(mp.size()==capacity)
        remove(tail.prev);//because this is least used

        insert(new Node(key,value));


    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */