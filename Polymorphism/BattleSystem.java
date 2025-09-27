abstract class Character {
  String name;

  Character(String name) {
    this.name = name;
  }

  public abstract void attack();
}

class Warrior extends Character {
  Warrior(String name) {
    super(name);
  }

  @Override
  public void attack() {
    System.out.println(name + " GENOCIDE");
  }
}

class Mage extends Character {
  Mage(String name) {
    super(name);
  }

  @Override
  public void attack() {
    System.out.println(name + " KILL EVERYTHING");
  }
}

class Archer extends Character {
  Archer(String name) {
    super(name);
  }

  @Override
  public void attack() {
    System.out.println(name + " SHOOOOT");
  }
}

public class BattleSystem {
  public static void main(String[] args) {
    Character[] army = {
        new Warrior("Thor"),
        new Mage("Gandalf"),
        new Archer("Legolas")
    };

    for (Character c : army) {
      c.attack();
    }
  }
}
