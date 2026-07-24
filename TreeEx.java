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

public class TreeEx {
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    


  public static void main(String[] args) {
    Node root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.left.left=new Node(40);
    root.left.right=new Node(50);
    preOrderTraversal(root);

   }

}
