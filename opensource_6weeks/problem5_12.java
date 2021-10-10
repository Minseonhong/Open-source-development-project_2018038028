package problem_6weeks;
import java.util.*;
abstract class Shape{
    private Shape next;
    public Shape(){
        next = null;
    }
    public void setNext(Shape obj){
        next = obj;
    }
    public Shape getNext(){
        return next;
    }
    public abstract void draw();
}
 
class Line extends Shape{
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
 
class GraphicEditor{
    private Scanner scanner;
    boolean flag;
    private Shape shape;
    private Shape last;
    public GraphicEditor(){
        scanner = new Scanner(System.in);
        flag = true;
    }
    public void run(){
        System.out.println("�׷��� ������ beauty�� �����մϴ�.");
        while(flag){
            System.out.print("����(1), ����(2), ��κ���(3), ����(4) >> ");
            int select = scanner.nextInt();
            switch (select){
                case 1:
                    this.insert();
                    break;
                case 2:
                    this.delete();
                    break;
                case 3:
                    this.view();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("�߸��Է��߽��ϴ�.");
                    break;
            }
        }
        System.out.println("beauty�� �����մϴ�.");
        scanner.close();
    }
 
    public void insert(){
        System.out.print("Line(1), Rect(2), Circle(3) >> ");
        int select = scanner.nextInt();
        switch (select){
            case 1:
                if(shape == null){
                    shape = new Line();
                    last = shape;
                }
                else{
                    last.setNext(new Line());
                    last = last.getNext();
                }
                break;
            case 2:
                if(shape == null){
                    shape = new Rect();
                    last = shape;
                }
                else{
                    last.setNext(new Rect());
                    last = last.getNext();
                }
                break;
            case 3:
                if(shape == null){
                    shape = new Circle();
                    last = shape;
                }
                else{
                    last.setNext(new Circle());
                    last = last.getNext();
                }
                break;
            default:
                System.out.println("�߸��Է��߽��ϴ�.");
                break;
        }
    }
    public void view(){
        Shape temp = shape;
        while(true){
            if(temp != null){
                if(temp.getNext() == null){
                    temp.draw();
                    break;
                }
                else{
                    temp.draw();
                    temp = temp.getNext();
                }
            }
            else{
                System.out.println("�ƹ��͵� �����ϴ�.");
                break;
            }
        }
    }
    public void delete(){
        Shape temp = shape;
        System.out.print("������ ������ ��ġ >> ");
        int select = scanner.nextInt();
        int count = 1;
        if(select == 1){
            shape = shape.getNext();
        }
        else{
            while(true){
                if(count != select-1){
                    count++;
                    temp = temp.getNext();
                }
                else{
                    if(temp.getNext() != null){
                        if(temp.getNext().getNext() == null){
                            last = temp;
                        }
                        temp.setNext(temp.getNext().getNext());
                    }
                    else{
                        System.out.println("������ �� �����ϴ�.");
                    }
                    break;
                }
            }
        }
    }
}
 
public class problem5_12 {
    public static void main(String[] args){
        GraphicEditor g = new GraphicEditor();
        g.run();
    }
}
