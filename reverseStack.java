//reverse a stack using recursion
import java.util.*;
public class reverseStack
{
    public static void pushAtBottom(int val,Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(val);
            return;
        }
        int top=s.pop();
        pushAtBottom(val,s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
         int top=s.pop();
         reverse(s);
         pushAtBottom(top,s);
    }
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
        reverse(s);
        System.out.println("AFTER:"+s);
    }
}
