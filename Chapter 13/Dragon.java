// Dragon enemy subclass
 
// TODO: Extend Enemy
 
public class Dragon extends Enemy {
 
    // TODO: Create constructor (call super)
    Dragon(String name, int health, int damage) {
        super(name, health, damage);
    }
 
    // TODO: Implement update()
    @Override
    public void update() {
        System.out.println(this.name + " circles the battlefield from above.");
    }
 
    @Override
    // TODO: Implement attack()
    public void attack() {
        System.out.println(this.name + " breathes a massive fire blast!");
    }
}