import java.util.*;
public class Exceptions{
    public static void main(String[] args){
        int num1,num2,result;
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter First number");
        num1 = Integer.parseInt(sc.next());
        System.out.println("Enter Second number");
        num2 = Integer.parseInt(sc.next());
        result = num1/num2;
        System.out.println("Division: "+result);
        int x[] = new int[12];
        x[15] = 10;
        System.out.println("x[15] = "+x[15]);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator is zero " + e);
        }
        catch(NumberFormatException e){
            System.out.println("Input is Wrong " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong Index Number " + e);
        }
    }
}
