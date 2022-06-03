import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        final int weaponTypes = 5;
        Player p = new Player();
        final int len = p.getSlotsCount();
        Assertions.assertEquals(weaponTypes, len);
    }

    @org.junit.jupiter.api.Test
    public void testConcat_validType_success() {
        Player p = new Player();
        Gun g = new Gun();
        Assertions.assertEquals(p.weaponSlots[1].getClass(), g.getClass());
    }

    @org.junit.jupiter.api.Test
    public void testConcat_nullArgument_throwsException() {
        Player p = new Player();
        assertThrows(NullPointerException.class, () -> {
            p.shotWithWeapon(null);
        });
    }


}
