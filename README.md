# Player Battle Game

This Java program simulates a battle between two players, Player A and Player B, each with their own attributes such as health, strength, and attack power.

## Player Class

The `Player` class represents a player in the game. It has the following attributes:

- `health`: The player's health points.
- `strength`: The player's strength attribute.
- `attack`: The player's attack power.

The class provides the following methods:

- `rollDice()`: Simulates rolling a six-sided dice and returns a random number from 1 to 6.
- `attackPower(int roll)`: Calculates the player's attack power based on the roll of the dice.
- `defendPlayer(int roll)`: Calculates the player's defense power based on the roll of the dice.
- `attack(Player opponent)`: Simulates the player attacking the opponent by rolling the dice, comparing attack power with opponent's defense, and reducing opponent's health accordingly.

## Main Class

The `Main` class contains the main method to run the game. It prompts the user to input the attributes for Player A and Player B (health, strength, and attack), creates the players, and simulates a battle between them.

The game continues until one of the players' health drops to or below 0. Then, it prints out the winner of the game.

## How to Use

1. Compile the Java code using a Java compiler such as `javac`:

    ```
    javac Main.java
    ```

2. Run the compiled program:

    ```
    java Main
    ```

3. Follow the prompts to input the attributes for Player A and Player B.
4. The program will simulate the battle and output the winner of the game.

Enjoy playing the Player Battle Game!


## Testing

### Unit Tests

The project includes unit tests to verify the functionality of the `Player` class. These tests cover different aspects of the player's behavior, including attack power calculation, defense power calculation, and attack behavior.

#### Test Cases

1. **testPlayerAttackPower():**
   - Verifies that the `attackPower()` method correctly calculates the attack power based on the input roll.
   - Creates a player with predefined attributes and checks if the calculated attack power matches the expected value.

2. **testPlayerDefendPlayer():**
   - Ensures that the `defendPlayer()` method correctly calculates the defense power based on the input roll.
   - Creates a player with specific attributes and validates if the calculated defense power matches the expected value.

3. **testPlayerAttack():**
   - Simulates an attack between two players (`attacker` and `defender`) and verifies that the defender's health does not exceed its maximum value after the attack.
   - Creates two players with identical attributes, initiates an attack, and checks if the defender's health remains within the expected range.

### How to Run Tests

To run the unit tests:
1. We can run the unit tests using Integrated Development Environment (IDE) IntelliJ Community Edition. 
2. We give the main class in the main folder and the unit tests file in the test folder.
3. Then run the tests folder in the environment.

