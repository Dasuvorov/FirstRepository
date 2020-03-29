public class CustomClass extends BasedClass {


    CustomClass(String s) {
        super(s);
        System.out.println("Custom class");
    }


    public static void main(String[] args) {
        CustomClass cs = new CustomClass(" Object cs");
    }
}