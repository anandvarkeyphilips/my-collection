package io.exnihilo.inheritance;

/**
 * The argument list should be exactly the same as that of the overridden method.
 *
 * The return type should be the same or a subtype of the return type declared in the original overridden method in the superclass.
 *
 * The access level cannot be more restrictive than the overridden method's access level. For example: If the superclass method is declared public then the overridding method in the sub class cannot be either private or protected.
 *
 * Instance methods can be overridden only if they are inherited by the subclass.
 *
 * A method declared final cannot be overridden.
 *
 * A method declared static cannot be overridden but can be re-declared.
 *
 * If a method cannot be inherited, then it cannot be overridden.
 *
 * A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.
 *
 * A subclass in a different package can only override the non-final methods declared public or protected.
 *
 * An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not. However, the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. The overriding method can throw narrower or fewer exceptions than the overridden method.
 *
 * Constructors cannot be overridden.
 */

public class SingleInheritance {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.talk();
        animal.eat();
        //animal.bark(); not available for A
        System.out.println("-------------------------------------------------------");

        Dog dog = new Dog();
        dog.talk();
        dog.eat();
        dog.eatSuper();
        dog.bark();
        System.out.println("-------------------------------------------------------");

        Animal dogAnimal = new Dog();
        dogAnimal.talk();
        dogAnimal.eat();
        ((Dog) dogAnimal).eat();
        //dogAnimal.bark(); not available for Animal -> Need down-casting like below
        ((Dog) dogAnimal).bark();
        System.out.println("-------------------------------------------------------");

        //java.lang.ClassCastException: io.exnihilo.inheritance.Animal cannot be cast to io.exnihilo.inheritance.Dog
        //Dog dog1 = (Dog) new Animal();
    }
}