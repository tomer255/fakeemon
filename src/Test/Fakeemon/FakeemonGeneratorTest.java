package Fakeemon;

import Moves.Move;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FakeemonGeneratorTest {

    int amountOfAttacks = 4;
    List<Move> moves;

    @Test
    public void testGenerateAardartFakeemon() {
        FakeemonGenerator fakeemonGenerator = new FakeemonGenerator();
        Fakeemon fakeemonReturned = FakeemonGenerator.generateFakeemon(FakeemonGenerator.eFakeemonID.aardart);

        moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Electric, amountOfAttacks);
        Fakeemon fakeemonExpected = new Fakeemon("aardart", TypeBalance.ElementType.Electric, 320, 320,
                moves, 3.3f, 3.5f, 3.4f, 3.2f, 5.4f);

        Assert.assertFalse(fakeemonReturned.equals(fakeemonExpected));
    }

    @Test
    public void testGenerateAnoleafFakeemon() {
        FakeemonGenerator fakeemonGenerator = new FakeemonGenerator();
        Fakeemon fakeemonReturned = fakeemonGenerator.generateFakeemon(FakeemonGenerator.eFakeemonID.anoleaf);

        moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Water, amountOfAttacks);
        Fakeemon fakeemonExpected = new Fakeemon("anoleaf", TypeBalance.ElementType.Water, 350, 350,
                moves, 3.5f, 3.8f, 3.4f, 3f, 5f);

        Assert.assertFalse(fakeemonReturned.equals(fakeemonExpected));
    }

    @Test
    public void testGenerateAgniteFakeemon() {
        FakeemonGenerator fakeemonGenerator = new FakeemonGenerator();
        Fakeemon fakeemonReturned = fakeemonGenerator.generateFakeemon(FakeemonGenerator.eFakeemonID.agnite);

        moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Fire, amountOfAttacks);
        Fakeemon fakeemonExpected = new Fakeemon("agnite", TypeBalance.ElementType.Fire, 260, 260,
                moves, 3.7f, 3.4f, 3.8f, 3f, 5f);

        Assert.assertFalse(fakeemonReturned.equals(fakeemonExpected));
    }

    @Test
    public void testGenerateBamboonFakeemon() {
        FakeemonGenerator fakeemonGenerator = new FakeemonGenerator();
        Fakeemon fakeemonReturned = fakeemonGenerator.generateFakeemon(FakeemonGenerator.eFakeemonID.bamboon);

        moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Grass, amountOfAttacks);
        Fakeemon fakeemonExpected = new Fakeemon("bamboon", TypeBalance.ElementType.Grass, 300, 300,
                moves, 3.4f, 3.6f, 3.8f, 3f, 4f);

        Assert.assertFalse(fakeemonReturned.equals(fakeemonExpected));
    }

    @Test
    public void testGenerateCardiwingFakeemon() {
        FakeemonGenerator fakeemonGenerator = new FakeemonGenerator();
        Fakeemon fakeemonReturned = fakeemonGenerator.generateFakeemon(FakeemonGenerator.eFakeemonID.cardiwing);

        moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Flying, amountOfAttacks);
        Fakeemon fakeemonExpected = new Fakeemon("cardiwing", TypeBalance.ElementType.Flying, 280, 280,
                moves, 3.2f, 3.3f, 3.9f, 5f, 7f);

        Assert.assertFalse(fakeemonReturned.equals(fakeemonExpected));
    }



}
