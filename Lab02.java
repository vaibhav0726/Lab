public class Lab02 {
    int rollno;
    String name;
    Lab02(){
        rollno = 10;
        name = "vaibhav";
    }
    Lab02(int rollno, String name){
        this.rollno= rollno;
        this.name = name;
    }

    public void display(Lab02 obj){
        System.out.println(obj.rollno);
        System.out.println(obj.name);
    }
    public static void main(String[] args) {
        Lab02 obj = new Lab02();
        Lab02 obj1 = new Lab02(20,"varshney");
        obj.display(obj);
        obj1.display(obj1);

        }
}
// and concept of package
