import java.util.Stack;
public class Stringstack {
    public static void main(String[]args){
        String s="string";
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));

        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
        



    }
    
}
