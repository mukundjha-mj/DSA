
import java.util.Scanner;

public class DigitConcept{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastdigit;
        int count= 0 ;
        while(n>0){
            lastdigit = n % 10;
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}