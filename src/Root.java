public class Root {

    Root(String s){
        System.out.println( s+= " Root");
    }
    Component1 c1 = new Component1(10);
    Component2 c2 = new Component2("Stas");
    Component3 c3 = new Component3('a');

    void dispose(){
        System.out.println("Root despose");
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }

}
