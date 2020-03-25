import DimaSuvorov.Family;


public class FamilyExample {

    public static void main(String[] args) {

        Family man = new Family("Dima", "father", 37 );
        Family woman = new Family("Julia", "mother", 33);
        Family girl = new Family("Sofia", "dougter", 9);
        Family animal = new Family("DJackson", "cat", 4);

        java.util.Scanner scan = new java.util.Scanner(System.in);
        DimaSuvorov.Scanner scanner = new DimaSuvorov.Scanner();

        System.out.println(man.toString());
        System.out.println(woman.toString());
        System.out.println(girl.toString());
        System.out.println(animal.toString());
    }
}
