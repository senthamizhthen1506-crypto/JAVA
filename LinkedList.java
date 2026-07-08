public class LinkedList {
    Node head;
    public void insertAtBegining(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        
        Node newNode=new Node(data);
           Node temp=head;
           if(head==null){
            head=new Node(data);
           }
           while(temp.next!=null){
            temp=temp.next;
           }
    }
    public void imsertAtend(int data){
        Node newNode=new Node(data);
           Node temp=head;
           if(head==null){
            head=newNode;
           }
           while(temp.next!=null){
            temp=temp.next;
           }
        

    }
    
    public class LinkedListEx{

    public static void main(String[]args){
            LinkedList list=new LinkedList();
            list.insertAtBegining(30);
            list.insertAtBegining(20);
            list.insertAtBegining(10);
            Node temp=list.head;
            while (temp!=null){
                System.out.println(temp .data+" ->");
              temp=temp.next;
              System.out.println("null");
    }
      

    }
 }

            



    
    
    
}
