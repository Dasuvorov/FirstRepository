public abstract class Figure {
    int side1;
    int side2;
    public Figure(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    abstract void countArea();
}
 class Triangle extends Figure {
    public Triangle(int side1, int side2) {
        super(side1, side2);
    }
    @Override
    void countArea() {
        System.out.print(0.5 * side1 * side2 + ", ");
        System.out.print(0.5 * this.side1 * this.side2 + ", "); //1
    }
}
class Rectangle extends Figure {
    private int side1 = 1;
    private int side2 = 1;
    public Rectangle(int side1, int side2) {
        super(side1, side2);
    }
    @Override
    void countArea() {
        System.out.print(side1 * side2 + ", ");
        System.out.print(super.side1 * super.side2);
    }
}
class Program {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3, 4);
        triangle.countArea();
        Figure rectangle = new Rectangle(1, 2);
        rectangle.countArea();
    }
}
