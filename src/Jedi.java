// Jedi class
class Jedi extends Character {
    public Jedi(String name, String race) {

        super(name, race);
    }

    @Override
    public void attack() {

        System.out.println(name + " attacks with a lightsaber.");
    }

    // Force attack
    public void attackWithForce() {

        System.out.println(name + " uses the Force to attack.");
    }

    @Override
    public void defend() {

        System.out.println(name + " defends with the Force.");
    }
}