// Lab: Abstract Enemies
// TODO: Declare this class as abstract
 
abstract class Enemy {
 
    // TODO: Add protected instance variables:
    // health, damage, name
    protected int health, damage;
    protected String name;
 
    // TODO: Create a constructor that initializes all fields
    Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
 
    // TODO: Declare abstract methods:
    abstract public void update();
    abstract public void attack();
 
    // TODO: Create a concrete takeDamage(int amount) method
    public void takeDamage(int amount) {
        this.health -= amount;
        System.out.println(this.name + " takes " + amount + " damage! Remaining health: " + this.health);
    }
 
    // TODO: Add a getName() method
    public String getName() {
        return this.name;
    }
}