// Slime enemy subclass
 
// TODO: Extend Enemy
 
public class Slime extends Enemy {
 
    // TODO: Create constructor
    // Must call super(...)
    Slime(String name, int health, int damage) {
        super(name, health, damage);
    }
 
    // TODO: Implement update()
    public void update() {
        System.out.println(this.name + " wiggles closer...");
    }
 
    // TODO: Implement attack()
    public void attack() {
        System.out.println(this.name + " spits a blob of goo!"); 
    }
}