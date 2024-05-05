import java.util.Random;
import java.util.Scanner;

public class Main {

    public static class Player {
        int health, strength, attack;

        Player(int health, int strength, int attack) {
            this.health = health;
            this.strength = strength;
            this.attack = attack;
        }

        public int rollDice() {
            Random rand = new Random();
            return rand.nextInt(6) + 1;
        }

        public int attackPower(int roll) {
            return roll * this.attack;
        }

        public int defendPlayer(int roll) {
            return roll * this.strength;
        }

        public void attack(Player opponent) {
            int roll = rollDice();
            System.out.println("A player rolls attack:" + roll);
            int opponentRoll = opponent.rollDice();
            System.out.println("B player rolls defend:" + opponentRoll);
            if (attackPower(roll) > opponent.defendPlayer(opponentRoll)) {
                opponent.health -= (attackPower(roll) - opponent.defendPlayer(opponentRoll));
            }
            System.out.println("B player health:" + opponent.health);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter health for player A:");
        int healthA = scanner.nextInt();
        System.out.println("Enter strength for player A:");
        int strengthA = scanner.nextInt();
        System.out.println("Enter attack for player A:");
        int attackA = scanner.nextInt();

        System.out.println("Enter health for player B:");
        int healthB = scanner.nextInt();
        System.out.println("Enter strength for player B:");
        int strengthB = scanner.nextInt();
        System.out.println("Enter attack for player B:");
        int attackB = scanner.nextInt();

        Player A = new Player(healthA, strengthA, attackA);
        Player B = new Player(healthB, strengthB, attackB);
        boolean aAttacksFirst = A.health < B.health;

        while (A.health > 0 && B.health > 0) {
            if (aAttacksFirst) {
                A.attack(B);
                if (B.health <= 0) {
                    break;
                }
                B.attack(A);
            } else {
                B.attack(A);
                if (A.health <= 0) {
                    break;
                }
                A.attack(B);
            }
        }

        if (A.health > 0) {
            System.out.println("A has won the game");
        } else {
            System.out.println("B Has won the game");
        }
    }
}
