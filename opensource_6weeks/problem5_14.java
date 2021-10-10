package problem_6weeks;

interface Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
 
class Circle implements Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }
    @Override
    public double getArea() {
        return this.radius*this.radius*PI;
    }
}
 
class Oval implements Shape{
    private int a, b;
    public Oval(int a, int b){
        this.a = a;
        this.b = b;
    }
 
    @Override
    public void draw() {
        System.out.println(this.a + "x" + this.b + "에 내접하는 타원입니다.");
    }
 
    @Override
    public double getArea() {
        return this.a*this.b*PI;
    }
}
 
class Rect implements Shape{
    private int x, y;
    public Rect(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        System.out.println(this.x + "x" + this.y + "크기의 사각형 입니다.");
    }
    @Override
    public double getArea() {
        return this.x*this.y;
    }
}
 
public class problem5_14 {
    public static void main(String[] args){
        Shape list[] = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);
 
        for(int i=0; i<list.length; i++){
            list[i].redraw();
        }
        for(int i=0; i<list.length; i++){
            System.out.println("면적은 " + list[i].getArea());
        }
    }
}
