// Abstract base class
abstract class MagicalStructure {
  String structureName;
  int magicPower;
  String location;
  boolean isActive;

  // Constructor overloading with this() chaining
  MagicalStructure() {
    this("Unknown", 0, "Unknown", false);
  }

  MagicalStructure(String structureName, int magicPower) {
    this(structureName, magicPower, "Unknown", true);
  }

  MagicalStructure(String structureName, int magicPower, String location, boolean isActive) {
    this.structureName = structureName;
    this.magicPower = magicPower;
    this.location = location;
    this.isActive = isActive;
  }

  // Abstract method
  abstract void castMagicSpell();
}

// WizardTower
class WizardTower extends MagicalStructure {
  int spellCapacity;
  String[] knownSpells;

  // Empty tower
  WizardTower() {
    super("Wizard Tower", 50);
    this.spellCapacity = 0;
    this.knownSpells = new String[0];
  }

  // Basic spells
  WizardTower(int spellCapacity, String[] spells) {
    super("Wizard Tower", 100);
    this.spellCapacity = spellCapacity;
    this.knownSpells = spells;
  }

  // Fully equipped
  WizardTower(int spellCapacity, String[] spells, String location) {
    super("Wizard Tower", 200, location, true);
    this.spellCapacity = spellCapacity;
    this.knownSpells = spells;
  }

  @Override
  void castMagicSpell() {
    System.out.println(structureName + " casts arcane spell!");
  }
}

// EnchantedCastle
class EnchantedCastle extends MagicalStructure {
  int defenseRating;
  boolean hasDrawbridge;

  // Simple fort
  EnchantedCastle() {
    super("Enchanted Castle", 50);
    this.defenseRating = 100;
    this.hasDrawbridge = false;
  }

  // Royal castle
  EnchantedCastle(int defenseRating, boolean hasDrawbridge) {
    super("Enchanted Castle", 150);
    this.defenseRating = defenseRating;
    this.hasDrawbridge = hasDrawbridge;
  }

  // Impregnable fortress
  EnchantedCastle(int defenseRating, boolean hasDrawbridge, String location) {
    super("Enchanted Castle", 300, location, true);
    this.defenseRating = defenseRating;
    this.hasDrawbridge = hasDrawbridge;
  }

  @Override
  void castMagicSpell() {
    System.out.println(structureName + " radiates protective wards!");
  }
}

// MysticLibrary
class MysticLibrary extends MagicalStructure {
  int bookCount;
  String ancientLanguage;

  // Few books
  MysticLibrary() {
    super("Mystic Library", 40);
    this.bookCount = 100;
    this.ancientLanguage = "Unknown";
  }

  // Ancient collection
  MysticLibrary(int bookCount, String ancientLanguage) {
    super("Mystic Library", 120);
    this.bookCount = bookCount;
    this.ancientLanguage = ancientLanguage;
  }

  @Override
  void castMagicSpell() {
    System.out.println(structureName + " whispers forgotten knowledge!");
  }
}

// DragonLair
class DragonLair extends MagicalStructure {
  String dragonType;
  int treasureValue;

  DragonLair(String dragonType) {
    super("Dragon Lair", 200);
    this.dragonType = dragonType;
    this.treasureValue = 1000;
  }

  DragonLair(String dragonType, int treasureValue, String location) {
    super("Dragon Lair", 400, location, true);
    this.dragonType = dragonType;
    this.treasureValue = treasureValue;
  }

  @Override
  void castMagicSpell() {
    System.out.println(structureName + " unleashes dragon fire!");
  }
}

// Interaction utilities
class MagicInteraction {
  static boolean canStructuresInteract(MagicalStructure s1, MagicalStructure s2) {
    return s1.isActive && s2.isActive;
  }

  static String performMagicBattle(MagicalStructure attacker, MagicalStructure defender) {
    if (attacker.magicPower > defender.magicPower) {
      return attacker.structureName + " wins!";
    } else if (attacker.magicPower < defender.magicPower) {
      return defender.structureName + " wins!";
    } else {
      return "It's a draw!";
    }
  }

  static int calculateKingdomMagicPower(MagicalStructure[] structures) {
    int total = 0;
    for (MagicalStructure s : structures) {
      total += s.magicPower;
    }
    return total;
  }
}

// Kingdom Manager
class KingdomManager {
  static void categorizeStructures(MagicalStructure[] structures) {
    for (MagicalStructure s : structures) {
      if (s instanceof WizardTower) {
        System.out.println(s.structureName + " -> Magic Source");
      } else if (s instanceof EnchantedCastle) {
        System.out.println(s.structureName + " -> Defense Stronghold");
      } else if (s instanceof MysticLibrary) {
        System.out.println(s.structureName + " -> Knowledge Center");
      } else if (s instanceof DragonLair) {
        System.out.println(s.structureName + " -> Dragon Habitat");
      }
    }
  }

  static double calculateTax(MagicalStructure s) {
    if (s instanceof WizardTower)
      return 100.0;
    if (s instanceof EnchantedCastle)
      return 200.0;
    if (s instanceof MysticLibrary)
      return 150.0;
    if (s instanceof DragonLair)
      return 500.0;
    return 50.0;
  }

  static String determineSpecialization(MagicalStructure[] structures) {
    int magic = 0, defense = 0;
    for (MagicalStructure s : structures) {
      if (s instanceof WizardTower || s instanceof MysticLibrary) {
        magic += s.magicPower;
      } else if (s instanceof EnchantedCastle || s instanceof DragonLair) {
        defense += s.magicPower;
      }
    }
    if (magic > defense)
      return "Magic-focused Kingdom";
    else if (defense > magic)
      return "Defense-focused Kingdom";
    else
      return "Balanced Kingdom";
  }
}

// Driver
public class MagicalKingdomDemo {
  public static void main(String[] args) {
    MagicalStructure[] structures = {
        new WizardTower(5, new String[] { "Fireball", "Ice Blast" }),
        new EnchantedCastle(200, true),
        new MysticLibrary(500, "Elder Tongue"),
        new DragonLair("Fire Dragon", 2000, "Mountain Peak")
    };

    // Categorize
    KingdomManager.categorizeStructures(structures);

    // Total magic power
    System.out.println("Kingdom Magic Power: " +
        MagicInteraction.calculateKingdomMagicPower(structures));

    // Battle example
    System.out.println(MagicInteraction.performMagicBattle(structures[0], structures[1]));

    // Tax calculation
    for (MagicalStructure s : structures) {
      System.out.println(s.structureName + " tax: " + KingdomManager.calculateTax(s));
    }

    // Specialization
    System.out.println("Specialization: " + KingdomManager.determineSpecialization(structures));
  }
}
