// Skeleton enemy subclass
 
// TODO: Extend Enemy
 
public class Skeleton extends Enemy {
 
    // TODO: Create constructor (call super)
    Skeleton(String name, int health, int damage) {
        super(name, health, damage);
    }
 
    // TODO: Implement update()
    @Override
    public void update() {
        System.out.println(this.name + " patrols the area cautiously.");
    }
 
    @Override
    // TODO: Implement attack()
    public void attack() {
        System.out.println(this.name + " fires an arrow!");
    }
}