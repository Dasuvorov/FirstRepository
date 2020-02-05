public class Goblin implements Monster {

    int id;
    String name;

    public Goblin(int id, String name) {
        this.id = id;
        this.name = name;

    }


    @Override
    public void bye() {
        System.out.println("bye");

    }
}