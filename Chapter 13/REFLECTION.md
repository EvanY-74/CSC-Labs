1. Why can't you instantiate the Enemy class?

    You can't instantiate the Enemy class because it is an abstract class, meaning you can only inherit from it.

2. What would happen if a subclass did not implement update() or attack()?

    There would be an error saying that the subclass does not override the abstract method.

3. How does using Enemy[] demonstrate polymorphism?

    Multiple instances of different classes are using the the same 3 methods, `update()`, `attack()`, and `takeDamage()`.

4. Why is it helpful for Enemy to have a concrete method like takeDamage()?

    It is helpful for Enemy to have a concrete method so you don't need to constantly redefine the same functionality every time.

5. Could this design be implemented using interfaces alone? Why or why not?

    Yes, aspects of this program could be designed with interfaces like the requirement of the 3 methods by using `implements` instead of `extends`.