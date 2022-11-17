import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s1 = scan.nextLine();
       // String s2 = s1.replace(' ','');
        String s3 = "";
        for (int i = (s1.length() - 1); i >=0; --i) {
                s3 = s3 + s1.charAt(i);
        }
        if(s1.toLowerCase().equals(s3.toLowerCase())){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Its a not palindrome");
        }
        System.out.println(s1);
        System.out.println(s3);

    }
}