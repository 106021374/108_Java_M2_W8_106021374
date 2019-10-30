import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        while (n>-1){
            sum=sum+n;
            n=scn.nextInt();
        }
        System.out.println(sum);
    }
}
