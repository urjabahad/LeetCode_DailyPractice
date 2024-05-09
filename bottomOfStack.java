//insert element to the bottom of the stack
import java.util.*;
public class bottomOfStack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        int i=0;
        while(i!=999)
        {
            System.out.println("Enter element to be pushed to stack, 999 to end pushing");   
            i=sc.nextInt();
            s.push(i);
        }
        s.pop();
        System.out.println("BEFORE:"+s);
        System.out.println("Enter element to be inserted at the bottom:");
        int val=sc.nextInt();
        Stack<Integer> s2=new Stack<>();
        while(s.size()!=0)
        s2.push(s.pop());
        s.push(val);
        while(s2.size()!=0)
        s.push(s2.pop());
         System.out.println("AFTER:"+s);
    }
}
