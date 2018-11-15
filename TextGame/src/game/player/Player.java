package game.player;

import game.item.Armor;
import game.item.Item;
import game.item.Weapon;
import game.spell.Spell;

/**
 * Contains information of the Player.
 * Includes current score, armor, weapon, spells, and inventory.
 * 
 * @author Jessica Lucas
 *
 */
public class Player {
  /** Name of the Player */
  private String name;
  
  /** Current score of the Player */
  private int score;
  
  /** Number of steps Player has moved to the East from starting position */
  private int stepsEast;
  
  /** Number of steps Player has moved to the West from starting position */
  private int stepsWest;
  
  /** Number of steps Player has moved to the North from starting position */
  private int stepsNorth;
  
  /** Number of steps Player has moved to the South from starting position */
  private int stepsSouth;
  
  /** Currently equipped Armor for the Player */
  private Armor[] armor;
  
  /** Current defense value */
  private int defense;
  
  /** Currently equipped Weapon for the Player */
  private Weapon weapon;
  
  /** Current attack value */
  private int attack;
  
  /** Current inventory for the Player */
  private Item[] inventory;
  
  /** Current weight in inventory */
  private int weight;
  
  /** Current pack for carrying inventory */
  private Item pack;
  
  /** Current max weight the Plater can carry */
  private int maxWeight;
  
  /** Spells currently known by the Player */
  private Spell[] spells;
  
  /** Experience points currently earned by the Player */
  private int exp;
  
  /** Current Player level */
  private int level;
  
  /** Current health */
  private int health;
  
  /** Max health */
  private int maxHealth;
  
  /**
   * Constructor method for Player
   * @param name - Name of new Player
   */
  public Player( String name ) {
	  this.name = name;
	  score = 0;
	  stepsEast = 0;
	  stepsWest = 0;
	  stepsNorth = 0;
	  stepsSouth = 0;
  }
  
  /**
   * Returns the name of the Player
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns the current Player score
   */
  public int getScore() {
    return score;
  }
  
  /**
   * Increase current score by 
   * @param increase - Points to increase score by
   */
  public void increaseScore( int increase ) {
    score += increase;
  }
  
  /**
   * Returns the number of steps taken in the current direction
   * @param direction - Desired direction for steps
   */
  public int getSteps( String direction ) {
    if( direction == "north" ) {
      return stepsNorth;
    }
    else if( direction == "south" ) {
      return stepsSouth;
    }
    else if( direction == "east" ) {
      return stepsEast;
    }
    else if( direction == "west" ) {
      return stepsWest;
    }
    return 0;
  }
  
  /**
   * Allows the player to step a number of steps in a certain direction
   * @param direction - Direction of movement
   * @param steps - Number of steps to move
   */
  public void step( String direction, int steps ) {
    //TODO step method
  }
  
  /**
   * Adds the given item to the inventory if the Player can carry it,
   * or prints out a message asking if the Player wants to drop the item
   * or drop another item in the inventory
   * @param i - Item to be added to the inventory, if able
   */
  public void addToInventory( Item i ) {
    //TODO add item to inventory
  }

  /**
   * Returns the currently equipped Armor of the Player
   * @return armor
   */
  public Armor[] getArmor() {
    return armor;
  }

  /**
   * Returns the current defense value of the Player
   * @return defense
   */
  public int getDefense() {
    return defense;
  }

  /**
   * Returns the current weapon of the Player
   * @return weapon
   */
  public Weapon getWeapon() {
    return weapon;
  }

  /**
   * Returns the current attack value of the Player
   * @return attack
   */
  public int getAttack() {
    return attack;
  }

  /**
   * Returns the current inventory of the Player
   * @return inventory
   */
  public Item[] getInventory() {
    return inventory;
  }

  /**
   * Returns the current pack of the Player
   * @return pack
   */
  public Item getPack() {
    return pack;
  }

  /**
   * Returns the max weight that can be carried by the Player
   * @return maxWeight
   */
  public int getMaxWeight() {
    return maxWeight;
  }

  /**
   * Returns the currently known spells of the Player
   * @return spells
   */
  public Spell[] getSpells() {
    return spells;
  }

  /**
   * Returns the current experience points of the Player
   * @return exp
   */
  public int getExp() {
    return exp;
  }

  /**
   * Returns the current level of the Player
   * @return level
   */
  public int getLevel() {
    return level;
  }

  /**
   * Returns the current health of the Player
   * @return health
   */
  public int getHealth() {
    return health;
  }

  /**
   * Returns the max health of the Player
   * @return maxHealth
   */
  public int getMaxHealth() {
    return maxHealth;
  }
  
  /**
   * Returns the current weight of the Player inventory
   * @return weight
   */
  public int getWeight() {
    return weight;
  }
}
