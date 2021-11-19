// multithreading:-
import java.util.*;
public class Lab03 {
    public void m1() throws InterruptedException{
        m2();//to remove this exception we used Interrupted exception
    }
    public void m2() throws InterruptedException{
        Thread.sleep(1000); // it is checked exception and must be in try block
        // to remove this we use Interrupted exception with throws statement
        // but it creates error in m1()

    }

    public static void main(String[] args) {
        // Scanner s= new Scanner("System.in");
    //     while(s.hasNext()){
    //         s.next();
    //     }
    // }


    // try with resource:-
    // try(Scanner s=new Scanner(System.in)) // we can use more by using semicolon))
    // {
    //     // int i= s.next(); //generates the error
    //     int i=Integer.parseInt(s.next()); //solution of above 

    // }
    // catch(Exception obj){
    //     obj.printStackTrace();
    // //     System.out.println(obj.toString());
    //     System.out.println(obj.getMessage());
    // //     System.out.println(obj);        
    // }
    // System.out.println("end of the method!");

    // Integer i1= new Integer(122);
    // Integer i1 = Integer.valueOf(234); //autoboxing :- solution of above
    // Integer i1 = 345;  //autoboxing
    // int a =i1;  // unboxing

    Lab03 obj = new Lab03();
    try{
        obj.m1();
    }    
    catch(InterruptedException obj1){
        System.out.println(obj1);
    }
    System.out.println("end of the main method");


}
}
