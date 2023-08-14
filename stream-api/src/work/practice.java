package work;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        int num,temp,rev=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ass = num;
        while(num>0){
            temp = num%10;
            rev = (rev *10) + temp;
            num = num/10;
        }
        if(ass == rev){
            System.out.println(rev + " "+ "it is a palindrome");
        }else {
            System.out.println(rev);
            System.out.println("helloworld");
        }
    }
}
