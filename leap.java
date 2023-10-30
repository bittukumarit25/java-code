import java.util.*;
public class leap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=2000;
        boolean x=(year % 4)==0;
        boolean y=(year % 100)!=0;
        boolean z=((year % 100 ==0)&&(year %400 ==0));


        if(x && (y || z)){
            System.out.println(year+"is the leap year");
        }
        else {
            System.out.println(year+"not a leap year");
        }
    }
}