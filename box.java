/* Create class box and box3d. box3d is extended class of box. The above
two classes going to pull fill following requirement Include constructor.
 set value of length, breadth, height Find out area and volume.
Note: Base class and sub classes have respective methods and instance variables.
*/
public class box {
    public int l ,b,h;
    box(){
        l=10;
        b=9;
        h=7;
    }
}
 class box3d extends box {
     int volumn;
     int area;

     public void display3() {
         area = 2 * (l * b + b * h + h * l);
         volumn = l * b * h;
         System.out.println(area);
         System.out.println(volumn);
     }




     public static void main(String[] args) {
         box3d obj = new box3d();
         obj.display3();



     }

}