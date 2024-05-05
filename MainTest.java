import org.junit.Test;
import static org.junit.Assert.*;
public class MainTest {

    @Test
    public void testPlayerAttackPower() {
        Main.Player player = new Main.Player(100, 10, 5);
        assertEquals(25, player.attackPower(5));
    }

    @Test
    public void testPlayerDefendPlayer() {
        Main.Player player = new Main.Player(100, 10, 5);
        assertEquals(100, player.defendPlayer(10));
    }

    @Test
    public void testPlayerAttack() {
        Main.Player attacker = new Main.Player(100, 10, 5);
        Main.Player defender = new Main.Player(100, 10, 5);
        attacker.attack(defender);
        assertTrue(defender.health <= 100); 
    }


}
