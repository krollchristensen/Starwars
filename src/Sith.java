// Sith class
class Sith extends Character {
    public Sith(String name, String race) {

        super(name, race);
    }

    @Override
    public void attack() {

        System.out.println(name + " attacks with a red lightsaber.");
    }

    // Force Lightning attack
    public void attackWithForceLightning() {
        System.out.println(name + " uses Force Lightning to attack.");
    }

    @Override
    public void defend() {

        System.out.println(name + " defends with dark Force powers.");
    }
}
