    public class SinglyLinkedList {      
          public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node Head = null;
    public Node Tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(Head == null){
            Head = newNode;
            Tail = newNode;
        }
        else{
            Tail.next = newNode;
            Tail = newNode;
        }
    }
    public void removeFast() {
        if (Head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = Head;
        Head = Head.next;
        temp.next = null;
        System.out.println("First element removed");
    }
    public void find(int a){
        int count = 0,check = 0;
        Node currrent = Head;
        if(Head == null){
            System.out.println("Link is empty");
        return;
        }
        while(currrent != null){
            count++;
            if(currrent.data == a){
                check = 1;
                System.out.println("found at positon "+count);
            }
            currrent = currrent.next;
        }
        if(check == 0){
            System.out.println("Notfound");
        }
        
    }
    public void display(){
        Node currrent = Head;
        if(Head == null){
            System.out.println("Link is empty");
        return;
        }
        while(currrent != null){
            System.out.print(currrent.data+" ");
            currrent = currrent.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.display();
        sll.removeFast();
        sll.display();
        sll.find(8);
    }
}