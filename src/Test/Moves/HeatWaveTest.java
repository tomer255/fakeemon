package Moves;
import Fakeemon.Fakeemon;
import Fakeemon.TypeBalance;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class HeatWaveTest {

    @Test
    public void testActivateHeatWaveFireVsGrass() {
        List<Move> moves = new ArrayList<>();

        Fakeemon fakeemonAttacker = new Fakeemon("agnite", TypeBalance.ElementType.Fire, 260, 230,
                moves, 3.7f, 1.875f, 3.8f, 3f, 5f);

        Fakeemon fakeemonDefender = new Fakeemon("bamboon", TypeBalance.ElementType.Grass, 300, 250,
                moves, 3.4f, 5, 3.8f, 3f, 4f);
        Move testMove = new HeatWave();

        //Test number 1:
        testMove.activate(fakeemonAttacker, fakeemonDefender);
        assertEquals(212f, fakeemonDefender.getCurrentHP());
    }
}
