package Fakeemon;

import Moves.Move;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FakeemonHealAndDamageTest {

    @Test
    public void TestDamageFakeemon()
    {
        List<Move> moves = new ArrayList<>();
        Fakeemon fakeemon = new Fakeemon("aardart", TypeBalance.ElementType.Electric, 320, 320,
                moves, 3.3f, 3.5f, 3.4f, 3.2f, 5.4f);

        //Test number 1:
        fakeemon.Damage(35);
        assertEquals(310f, fakeemon.getCurrentHP());

        //Test number 2:
        fakeemon.Damage(70);
        assertEquals(290f, fakeemon.getCurrentHP());

        //Test number 3:
        fakeemon = new Fakeemon("aardart", TypeBalance.ElementType.Electric, 320, 0,
                moves, 3.3f, 3.5f, 3.4f, 3.2f, 5.4f);
        fakeemon.Damage(70);
        assertEquals(0f, fakeemon.getCurrentHP());

    }

    @Test
    public void TestHealFakeemon()
    {
        List<Move> moves = new ArrayList<>();
        Fakeemon fakeemon = new Fakeemon("aardart", TypeBalance.ElementType.Electric, 320, 260,
                moves, 3.3f, 3.5f, 3.4f, 3.2f, 5.4f);

        //Test number 1:
        fakeemon.Heal(30);
        assertEquals(290f, fakeemon.getCurrentHP());

        //Test number 2:
        fakeemon.Heal(20);
        assertEquals(310f, fakeemon.getCurrentHP());

        //Test number 3:
        fakeemon = new Fakeemon("aardart", TypeBalance.ElementType.Electric, 320, 320,
                moves, 3.3f, 3.5f, 3.4f, 3.2f, 5.4f);
        fakeemon.Heal(30);
        assertEquals(320f, fakeemon.getCurrentHP());
    }



}