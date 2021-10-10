package problem_6weeks;

interface Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- �ٽ� �׸��ϴ�. ");
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
        System.out.println("�������� " + this.radius + "�� ���Դϴ�.");
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
        System.out.println(this.a + "x" + this.b + "�� �����ϴ� Ÿ���Դϴ�.");
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
        System.out.println(this.x + "x" + this.y + "ũ���� �簢�� �Դϴ�.");
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
            System.out.println("������ " + list[i].getArea());
        }
    }
}
