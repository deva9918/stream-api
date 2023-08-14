package work;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n ,count=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n<=1){
            System.out.println("not a prime");
        }
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println("it is not a prime");
        }
        else {
            System.out.println("it is prime");
        }
        //hello

        }
}