public class SpaceShipDelegation {
private String name;
private SpaceShipControl control = new SpaceShipControl();
public SpaceShipDelegation(String name){
    this.name = name;

}
    void up (int velocity){
    control.up(velocity);
    }
    void down (int velocity){
    control.down(velocity);
    }
    void left (int velocity){
    control.left(velocity);
    }
    void right (int velocity){
    control.right(velocity);
    }
    void forward (int velocity){
    control.forward(velocity);
    }
    void back (int velocity){
        control.back(velocity);
    }
    void turboBoost(){
    control.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protection = new SpaceShipDelegation("NSEA Protection");
            protection.forward(100);

}

}
