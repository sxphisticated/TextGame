package game;

import java.util.Scanner;

import game.npc.Enemy;
import game.player.Player;
import game.spell.Spell;

/**
 * Main component of the Game. Handles user input for gameplay.
 * 
 * @author Jessica Lucas
 *
 */
public class Game {
  /**  */
  private static Player player;
  
  /**  */
  private static Enemy[] enemies;
  
  /**  */
  private static Spell[] spells;
  
  /**  */
  private static int turn;
  
  /**
   * 
   */
  public static void main( String args[] ) {
    setUp();
    
    Scanner scan = new Scanner( System.in );
    
    System.out.println( "Hello! Welcome to the Game! Before we start, what is your name?" );
    
    String name = scan.nextLine();
    
    player = new Player( name );
    
    System.out.println( "Welcome, " + player.getName() + ", to our Game!" );
    System.out.println( "In this Game, you control the world by typing! Commands will be given to you when needed, but here is a basic list now:" );
    help();
    
  }
  
  /**
   * Sets up the Game before Player starts
   */
  private static void setUp() {
    enemies = new Enemy[ 10 ];
    enemies[ 0 ] = Names.ENEMY1;
    enemies[ 1 ] = Names.ENEMY2;
    enemies[ 2 ] = Names.ENEMY3;
    enemies[ 3 ] = Names.ENEMY4;
    enemies[ 4 ] = Names.ENEMY5;
    enemies[ 5 ] = Names.ENEMY6;
    enemies[ 6 ] = Names.ENEMY7;
    enemies[ 7 ] = Names.ENEMY8;
    enemies[ 8 ] = Names.ENEMY9;
    enemies[ 9 ] = Names.ENEMY10;
    
    spells = new Spell[ 10 ];
  }
  
  /**
   * Prints out commands for the Game
   */
  private static void help() {
    System.out.println( "General Commands:" );
    System.out.println( "---------------------------------------------------------------------------------" );
    System.out.println( "|     armor | Gives information about your current armor                        |" );
    System.out.println( "|      drop | Drops the item with the name following the command                |" );
    System.out.println( "|      help | Shows the list of commands                                        |" );
    System.out.println( "|      info | Gives Player information such as name, current health, etc        |" );
    System.out.println( "| inventory | Lists current inventory information with item names and weights   |" );
    System.out.println( "|  location | Gives the current location with respect to starting position      |" );
    System.out.println( "|      quit | Exits the game, but does not save (saving not available)          |" );
    System.out.println( "|      roll | Roll the dice to move and take a turn                             |" );
    System.out.println( "|    spells | Lists your currently known spells                                 |" );
    System.out.println( "|       use | Use the item with the name following the command if in inventory  |" );
    System.out.println( "|    weapon | Gives information about your current weapon                       |" );
    System.out.println( "---------------------------------------------------------------------------------" );
    System.out.println();
    System.out.println( "Battle Commands:" );
    System.out.println( "---------------------------------------------------------------------------------" );
    System.out.println( "|    attack | Attack with your current weapon                                   |" );
    System.out.println( "|     spell | Use the spell with the name following the command if learned      |" );
    System.out.println( "|       use | Use the item with the name following the command if in inventory  |" );
    System.out.println( "---------------------------------------------------------------------------------" );
    System.out.println();
    System.out.println( "Sometimes you will also be prompted with other options, such as yes/no questions." );
  }
  
  /**
   * Initiates and works through a Battle
   * @param scan - Input Scanner for commands
   */
  private static void battle( Scanner scan ) {
    
  }
  
  /**
   * Takes a turn after the roll command
   */
  private static void roll() {
    
  }
  
  /**
   * Contains constants for enemies, spells, weapons, and armor
   * 
   * @author Jessica Lucas
   * 
   */
  private static class Names {
    /**  */
    public static final String[] ENEMY1ART = { "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "" };
    
    /**  */
    public static final String[] ENEMY2ART = { "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "" };
    
    /**  */
    public static final String[] ENEMY3ART = { "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "" };
    
    /**  */
    public static final String[] ENEMY4ART = { "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "" };
    
    /**  */
    public static final String[] ENEMY5ART = { "----------------------------------------------------------------------------------------------------",
                                               "|                                                                                                  |",
                                               "|                                                                              ,aa,       ,aa      |",
                                               "|                                                                              d\"  \"b    ,d\",`b    |",
                                               "|                                                                            ,dP a  \"b,ad8' 8 8    |",
                                               "|                                                                            d8' 8  ,88888a 8 8    |",
                                               "|                                                                           D8baa8ba888888888a8    |",
                                               "|                                                                        ,ad888888888YYYY888YYY,   |",
                                               "|                                                                     ,a888888888888\"   \"8P\"  \"b   |",
                                               "|                                                                 ,aad8888tt,8888888b (0 `8, 0 8   |",
                                               "|                             ____________________________,,aadd888ttt8888ttt\"8\"I  \"Yb,   `Ya  8   |",
                                               "|                       ,aad8888b888888aab8888888888b,     ,aatPt888ttt8888tt 8,`b,   \"Ya,. `\"aP   |",
                                               "|                   ,ad88tttt8888888888888888888888888ttttt888ttd88888ttt8888tt,t \"ba,.  `\"`d888   |",
                                               "|                ,d888tttttttttttttt888888888888888888888888ttt8888888888ttt888ttt,   \"a,   `88'   |",
                                               "|               a888tttttttttttttttttttttttttt8888888888888ttttt88888ttt888888888tt,    `\"\"8\"'     |",
                                               "|              d8P\"' ,tttttttttttttttttttttttttttttttttt88tttttt888tttttttt8a\"8888ttt,   ,8'       |",
                                               "|             d8tb  \" ,tt\"  \"\"tttttttttttttttttttttttttttttttttt88ttttttttttt, Y888tt\"  ,8'        |",
                                               "|             88tt)              \"t\" ttttt\" \"\"\"  \"\"\"    \"\" tttttYttttttttttttt, \" 8ttb,a8'         |",
                                               "|             88tt                    `\"b'                  \"\"t'ttttttttttt\"t\"t   t taP\"           |",
                                               "|             8tP                       `b                       ,tttttt' \" \" \"tt, ,8\"             |",
                                               "|            (8tb  b,                    `b,                 a,  tttttt'        \"\"dP'              |",
                                               "|            I88tb `8,                    `b                d'   tttttt        ,aP\"                |",
                                               "|            8888tb `8,                   ,P               d'    \"tt \"t'    ,a8P\"                  |",
                                               "|           I888ttt, \"b                  ,8'              ,8       \"tt\"  ,d\"d\"'                    |",
                                               "|          ,888tttt'  8b               ,dP\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"Y8        tt ,d\",d'                      |",
                                               "|        ,d888ttttP  d\"8b            ,dP'                  \"b,      \"ttP' d'                       |",
                                               "|      ,d888ttttPY ,d' dPb,        ,dP'      Normand         \"b,     t8'  8                        |",
                                               "|     d888tttt8\" ,d\" ,d\"  8      ,d\"'        Veilleux         `b     \"P   8                        |",
                                               "|    d888tt88888d\" ,d\"  ,d\"    ,d\"                             8      I   8                        |",
                                               "|   d888888888P' ,d\"  ,d\"    ,d\"                               8      I   8                        |",
                                               "|   88888888P' ,d\"   (P'    d\"                                 8      8   8                        |",
                                               "|   \"8P\"'\"8   ,8'    Ib    d\"                                  Y      8   8                        |",
                                               "|         8   d\"     `8    8                                   `b     8   Y                        |",
                                               "|         8   8       8,   8,                                   8     Y   `b                       |",
                                               "|         8   Y,      `b   `b                                   Y     `b   `b                      |",
                                               "|         Y,   \"ba,    `b   `b,                                 `b     8,   `\"ba,                  |",
                                               "|          \"b,   \"8     `b    `\"\"b                               `b     `Yaa,adP'                  |",
                                               "|            \"\"\"\"\"'      `baaaaaaP                                `YaaaadP\"'                       |",
                                               "|                                                                                                  |",
                                               "----------------------------------------------------------------------------------------------------" };
    
    /**  */
    public static final String[] ENEMY6ART = { "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "" };
    
    /**  */
    public static final String[] ENEMY7ART = { "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "" };

    /**  */
    public static final String[] ENEMY8ART = { "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "" };
    
    /**  */
    public static final String[] ENEMY9ART = { "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "",
                                               "" };
    
    /**  */
    public static final String[] ENEMY10ART = { "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "",
                                                "" };
    
    /** Enemy encountered while at Level 1 */
    public static final Enemy ENEMY1 = new Enemy( "Slime", 1 );
    
    /** Enemy encountered while at Level 2 */
    public static final Enemy ENEMY2 = new Enemy( "Spider", 2 );
    
    /** Enemy encountered while at Level 3 */
    public static final Enemy ENEMY3 = new Enemy( "Goblin", 3 );
    
    /** Enemy encountered while at Level 4 */
    public static final Enemy ENEMY4 = new Enemy( "Skeleton", 4 );
    
    /** Enemy encountered while at Level 5 */
    public static final Enemy ENEMY5 = new Enemy( "Dire Wolf", 5 );
    
    /** Enemy encountered while at Level 6 */
    public static final Enemy ENEMY6 = new Enemy( "Golem", 6 );
    
    /** Enemy encountered while at Level 7 */
    public static final Enemy ENEMY7 = new Enemy( "Orc", 7 );
    
    /** Enemy encountered while at Level 8 */
    public static final Enemy ENEMY8 = new Enemy( "Wraith", 8 );
    
    /** Enemy encountered while at Level 9 */
    public static final Enemy ENEMY9 = new Enemy( "Basilisk", 9 );
    
    /** Enemy encountered while at Level 10 */
    public static final Enemy ENEMY10 = new Enemy( "Dragon", 10 );
  }
}
