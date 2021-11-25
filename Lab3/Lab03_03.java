class voteException extends RuntimeException{
    public voteException(String obj){
        super(obj);
    }
}
public class Lab03_03 {
    Lab03_03(String s)
        {
            
        }
    public static void main(String[] args) {
        // throw new Lab03_03("My exception");
        // throw new ArithmeticException("/ by 0"); // solution of above


        int age=3;
        try{
            
        if(age<18){
            throw new voteException("not valid!");
        }
    }
    catch(voteException obj){
        System.out.println(obj);
        obj.printStackTrace();
    }
    }
}
