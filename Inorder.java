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

public class Inorder {
    public static void InorderTraversal(Node root){
        if(root==null){
            return;
        }
        InorderTraversal(root.left);
        System.out.println(root.data+"");
        InorderTraversal(root.right);

    }
    


  public static void main(String[] args) {
    Node root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.left.left=new Node(40);
    root.left.right=new Node(50);
    System.out.println("Inoder:");
    InorderTraversal(root);

   }

}
























