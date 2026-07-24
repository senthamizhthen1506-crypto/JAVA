import java.util.Queue;

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

public class TreeEx2{
    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data+" ");

    }

    public static void InOrderTraversal(Node root){
        if(root==null){
            return;
        }
        InOrderTraversal(root.left);
        System.out.println(root.data+" ");
        InOrderTraversal(root.right);
    }
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    public static void levelOrder(Node root){
        Queue<Node> queue=new java.util.LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node current=queue.poll();
            System.out.println(current.data+" ");
            if(current.left!=null)queue.offer(current.left);
            if(current.right!=null)queue.offer(current.right);
        }

    }
    
    


  public static void main(String[] args) {
    Node root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.left.left=new Node(40);
    root.left.right=new Node(50);
    System.out.println("levelOrder");
    levelOrder(root);
    System.out.println("postOrder:");
    postOrderTraversal(root);
    System.out.println("InOrder:");
    InOrderTraversal(root);
    System.out.println("preOrder:");
    preOrderTraversal(root);



   }

}

















































