class A {
    String version = "1.0 A";
    String testMethod() {
        return "A";
    }
}
class B extends A {
    String version = "2.0 B";
    String testMethod() {
        return "B";
    }
}
   class Main2 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.version + a.testMethod());
        Goblin goblin = new Goblin(1, "Vasia");
        goblin.hello();
        goblin.bye();


    }
}