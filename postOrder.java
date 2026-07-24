class Node{
   int data;
   Node left;
   Node right;
   Node(int data){
    this.data=data;
    left=null;
    right=null;
  }

}

public class postOrder {
    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data+" ");

    }
    


  public static void main(String[] args) {
    Node root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.left.left=new Node(40);
    root.left.right=new Node(50);
    System.out.println("postOrder:");
    postOrderTraversal(root);

   }

}

















































