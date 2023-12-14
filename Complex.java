import java.util.Scanner;
public class Complex{
float real,img;
Complex(){ }
Complex(float r,float i){
real = r;
img = i;
}
Complex add(Complex a){
Complex temp = new Complex();
temp.real = this.real + a.real;
temp.img = this.img + a.img;
return temp;
}
Complex sub(Complex a){
Complex temp = new Complex();
temp.real = this.real - a.real;
temp.img = this.img - a.img;
return temp;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
float m,n,x,y;
System.out.println("Enter real part for number 1");
m=sc.nextFloat();
System.out.println("Enter img part for number 1");
n=sc.nextFloat();
System.out.println("Enter real part for number 2");
x=sc.nextFloat();
System.out.println("Enter img part for number 2");
y=sc.nextFloat();
Complex c1 = new Complex(m,n);
Complex c2 = new Complex(x,y);
Complex result;
result = c1.add(c2);
System.out.println("Addition... "+result.real+"+"+result.img+"i");
result = c1.sub(c2);
System.out.println("Subtraction... "+result.real+"+"+result.img+"i");
}
}
