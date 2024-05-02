//implement tower of hanoi problem (recursively)
import java.util.*;
public class tower
{
    public static void move(int n,String source,String helper,String destination)
    {
        if(n==1)
        System.out.println(n+" moved to destination");
        else
        {
            //move n-1 towers to helper
            move(n-1,source,destination,helper);
            //move nth tower to destination
            System.out.println(n+" moved from "+source+" to "+destination);
            //move n-1 towers back to source
            move(n-1,helper,destination,source);
            //now repeat
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of RINGS");
        int n=sc.nextInt();
        String source="source",destination="destination",helper="helper";
        move(n,source,helper,destination);
    }
}
