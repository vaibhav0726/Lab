import java.util.Scanner;
class function{
    public static void prime(int x){
        int f = 0;
        for (int i = 2; i <= x/2; i++) {
            if(x%i==0) {
                f = 1;
                System.out.println("Not a prime");
                break;
            }
        }
        if(f==0) System.out.println("Prime number");
    }
    public static void factorial(int x){
        double f = 1;
        for(int i=x;i>1;i--)
            f *= i;
        System.out.println("Factorial : "+f);
    }
    public static void fibonacci(int x){
        int a = 0,b = 1;
        int total = a + b;
        System.out.println("Fibonacci ->");
        System.out.print(a+" "+b+" ");
        x -= 2;
        while(x!=0){
            System.out.print(total+" ");
            a = b;
            b = total;
            total = a+b;
            x -= 1;
        }
        System.out.println();
    }
}
class check{
    public static void check_function(int val)
    {
        Scanner sc = new Scanner(System.in);
        if(val==1) {
            System.out.print("Enter number to check prime : ");
            int x = sc.nextInt();
            function.prime(x);
        }
        else if(val==2) {
            System.out.print("Enter number of terms of fibonacci series : ");
            int x = sc.nextInt();
            function.fibonacci(x);
        }
        else if(val==3) {
            System.out.print("Enter number to calculate factorial : ");
            int x = sc.nextInt();
            function.factorial(x);
        }
        else{
            System.out.println("Program Finish.");
        }
    }
}
public class Lab03_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        do{
            System.out.println("Press 1 for Prime no.");
            System.out.println("Press 2 for Fibonacci series.");
            System.out.println("Press 3 for Factorial.");
            System.out.println("Press 4 for Exit.");
            System.out.print("Enter Your Choice -> ");
            t = sc.nextInt();
            check.check_function(t);
        }while (t != 4);
    }
}