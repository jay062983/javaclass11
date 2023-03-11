import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndarrays {
    public static void main(String[] args){


        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] num=new int[5];
       /* num[0]=2;
        num[1]=2;
        num[2]=2;
        num[3]=2;
        num[4]=2;*/

        /*num[0]=scan.nextInt();
        num[1]=scan.nextInt();
        num[2]=scan.nextInt();
        num[3]=scan.nextInt();
        num[4]=scan.nextInt();*/
        for (int i = 0; i < num.length; i++) {
            num[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(num));



    }
}
