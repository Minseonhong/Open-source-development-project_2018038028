package problem_7weeks;

class Circle{
    private int x, y, radius;
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public String toString(){
        return this.getClass().getName() + "(" + this.x + "," + this.y + ")반지름" + this.radius;
    }
    public boolean equals(Object obj){
        Circle c = (Circle)obj;
        if(this.x == c.x && this.y == c.y){
            return true;
        }
        else{
            return false;
        }
    }
}

public class problem6_2 {
    public static void main(String[] args){
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 30);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b)){
            System.out.println("같은 원");
        }
        else{
            System.out.println("서로 다른 원");
        }
    }
}





