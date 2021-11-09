/* Create class point with following instance variable and methods.
Instance variable: private int x,y
Constructors : public Point(), Point(int x, int y)
Methods : public void setX(int x), setY(int y), setXY(int x, int y) */
import java.util.Scanner;
public class point {
    private int x;
    private int y ;
    public point(){

    }

    public point (int x , int y){
       this.x=x;
       this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println(x + " "+ y);
    }



}