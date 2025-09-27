// File: GameBattle.java 
public class GameBattle {
  // TODO: Create an 'attack' method that takes damage (int) and prints "Basic
  // attack for [damage] points!"
  public void attack(int damage) {
    System.out.println("Basic attack for " + damage + " points!");
  }

  // TODO: Overload 'attack' method to take damage and weapon name // Print
  // "Attacking with [weapon] for [damage] points!"
  public void attack(int damage, String weapon) {
    System.out.println("Attacking with " + weapon + " for " + damage + " points!");
  }

  // TODO: Overload 'attack' method for critical hits (damage, weapon, isCritical)
  // If critical: "CRITICAL HIT! [weapon] deals [damage*2] points!" // Else: use
  // the previous overloaded method
  public void attack(int damage, String weapon, boolean isCritical) {
    if (isCritical) {
      System.out.println("CRITICAL HIT! " + weapon + " deals " + (damage * 2) + " points!");
    } else {
      attack(damage, weapon);
    }
  }

  // TODO: Overload 'attack' for team attacks (damage, String[] teammates)
  // Print "Team attack with [teammate names] for [damage * team size] total
  // damage!"
  public void attack(int damage, String[] teammates) {
    int teamSize = teammates.length;
    int totalDamage = damage * teamSize;

    StringBuilder names = new StringBuilder();
    for (int i = 0; i < teamSize; i++) {
      names.append(teammates[i]);
      if (i < teamSize - 1) {
        names.append(", ");
      }
    }

    System.out.println("Team attack with [" + names + "] for " + totalDamage + " total damage!");
  }

  public static void main(String[] args) {
    // TODO: Gaming Battle Simulation:
    // 1. Create a GameBattle object
    // 2. Test all overloaded attack methods:
    // - Basic attack with 50 damage
    // - Sword attack with 75 damage
    // - Critical bow attack with 60 damage
    // - Team attack with {"Alice", "Bob"} for 40 base damage // 3. Observe how the
    // compiler chooses the correct method based on parameters
    GameBattle battle = new GameBattle();
    battle.attack(50);
    battle.attack(75, "Sword");
    battle.attack(60, "Bow", true);
    battle.attack(40, new String[] { "Alice", "Bob" });
  }
}
