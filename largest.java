import java.util.*;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=10;  
        int B=3;  
        int C=2;
        if((A>=B)&& (A>=C)){
            System.out.println("A is largest number");
        }
        else if((B>=C)){
            System.out.println("B is largest number");
        }
        else{
            System.out.println("C is largest number");
        }
    }
}
