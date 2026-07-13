
import java.util.Scanner;

/**
 * ArmstrongNumber
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n;
        int sum = 0;
        while(n>0){
            int lastdigit = n % 10;
            sum = sum + (lastdigit*lastdigit*lastdigit);
            n = n /10;
        }
        if(sum == d){
            System.out.println(true);
        } else{ 
            System.out.println(false);
        }

    }
}