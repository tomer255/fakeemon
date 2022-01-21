package Moves;
import Fakeemon.Fakeemon;
import Fakeemon.MovesListGenerator;
import Fakeemon.TypeBalance;
import org.junit.Test;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AbsorbTest {

    @Test
    public void testActivate() {
        int amountOfAttacks = 4;

        List<Move> moves = new ArrayList<>();
        Fakeemon fakeemonAttacker = new Fakeemon("bamboon", TypeBalance.ElementType.Grass, 300, 250,
                moves, 3.4f, 3.6f, 3.8f, 3f, 4f);

        Fakeemon fakeemonDefender = new Fakeemon("agnite", TypeBalance.ElementType.Fire, 260, 260,
                moves, 3.7f, 3.4f, 3.8f, 3f, 5f);

        Move testMove = new Absorb();
        testMove.activate(fakeemonAttacker, fakeemonDefender);
//        assertEquals(320f, fakeemon.getCurrentHP());




    }
}