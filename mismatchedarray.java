
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter numbers n ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr1 = new char[n];
        char[] arr2 = new char[n];


        for(int i=0;i<n;i++) {
            System.out.println("Enter numbers for first array");
            arr1[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++) {
            System.out.println("Enter a number for second array");
            arr2[i]=sc.next().charAt(0);
        }

        for(int i=0;i<n;i++) {
            if(arr1[i]!=arr2[i]) {
                System.out.print(arr1[i]+""+arr2[i]+" ");
            }

        }
    }
}
