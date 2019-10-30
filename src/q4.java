import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a,b,c;
        while(n!=-999){
            if(n>0){
                a++;
            }
            else if(n==0){
                b++;

            }
            else{
                c++;

            }
            n=scn.nextInt();
        }
        System.out.println();
    }
}
