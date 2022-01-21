package Moves;
import Fakeemon.Fakeemon;
import Fakeemon.TypeBalance;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AbsorbTest {

    @Test
    public void testActivateAbsorbGrassVsFire(){

        List<Move> moves = new ArrayList<>();
        Fakeemon fakeemonAttacker = new Fakeemon("bamboon", TypeBalance.ElementType.Grass, 300, 250,
                moves, 3.4f, 3.6f, 3.8f, 3f, 4f);

        Fakeemon fakeemonDefender = new Fakeemon("agnite", TypeBalance.ElementType.Fire, 260, 260,
                moves, 3.7f, 2f, 3.8f, 3f, 5f);
        Move testMove = new Absorb();

        //Test number 1:
        testMove.activate(fakeemonAttacker, fakeemonDefender);
        assertEquals(255f, fakeemonDefender.getCurrentHP());
        assertEquals(255f, fakeemonAttacker.getCurrentHP());

    }

}