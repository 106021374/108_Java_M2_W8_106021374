import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int i=1;
        while(Math.pow(m,i)<=n){
            i++;
        }
        System.out.println();
    }
}
