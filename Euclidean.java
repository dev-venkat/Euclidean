import java.util.*;
public class Euclidean{

     public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter greater integer:");
        int op1 = scanner.nextInt();
        System.out.println("Enter lesser integer:");
        int op2 = scanner.nextInt();
        int rem=1;
        
        while (rem!=0)
        {
            rem=op1%op2;
            op1=op2;
            if(rem!=0)
            {
                op2=rem;
            }
        }
        
        System.out.println("G.C.D: "+op2);
     }
}
