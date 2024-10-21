// Base class
abstract class Character {
    String name;
    String race;

    public Character(String name, String race) {
        this.name = name;
        this.race = race;
    }

    // Overload attack methods
    public void attack() {
        System.out.println(name + " attacks with a weapon.");
    }

    public void attack(String weapon) {
        System.out.println(name + " attacks with " + weapon + ".");
    }

    // Overridable defend method
    public void defend() {
        System.out.println(name + " defends.");
    }
}