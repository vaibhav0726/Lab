/* Write a program to create interface named test. In this interface the
 member function is square. Implement this interface in arithmetic class.
 Create one new class called ToTestInt in this class use the object of arithmetic class.*/
 interface Test {
    public int x = 8;
    void square();
    // upto java 1.7 in interface , method is public abstract
}
class ToTestInt implements Test{

    public void square() {
        System.out.println(x*x);
    }

    public static void main(String[] args) {
        ToTestInt obj = new ToTestInt();
        obj.square();
    }

}