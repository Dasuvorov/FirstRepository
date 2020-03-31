public class Stem extends Root {
        Stem(){
            super(" Dima");
            System.out.println("Stem");
        }
           void dispose(){
            super.dispose();
           }
    public static void main(String[] args) {
            Stem stem = new Stem();
        try {

        }finally {
            stem.dispose();

        }
        }
}
