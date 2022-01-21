package Fakeemon;

import Moves.Move;

import java.util.List;

public class FakeemonGenerator {

    public static Fakeemon GenerateFakeemon(FakeemonGenerator.eFakeemonID fakeemonName) {
        int amountOfAttacks = 4;
        Fakeemon fakeemon = null;
        List<Move> moves;
        switch (fakeemonName) {
            case aardart -> {
                moves = MovesListGenerator.getMovesList(TypeBalance.ElementType.Electric, amountOfAttacks);
                fakeemon = new Fakeemon("aardart", TypeBalance.ElementType.Electric, 320, 320,
                        moves, 3.3f, 3.5f, 3.4f, 3.2f, 5.4f);
            }
            case agnite -> {
                moves = MovesListGenerator.getMovesList(TypeBalance.ElementType.Fire, amountOfAttacks);
                fakeemon = new Fakeemon("agnite", TypeBalance.ElementType.Fire, 260, 260,
                        moves, 3.7f, 3.4f, 3.8f, 3f, 5f);
            }
            case anoleaf -> {
                moves = MovesListGenerator.getMovesList(TypeBalance.ElementType.Water, amountOfAttacks);
                fakeemon = new Fakeemon("anoleaf", TypeBalance.ElementType.Water, 350, 350,
                        moves, 3.5f, 3.8f, 3.4f, 3f, 5f);
            }
            case bamboon -> {
                moves = MovesListGenerator.getMovesList(TypeBalance.ElementType.Grass, amountOfAttacks);
                fakeemon = new Fakeemon("bamboon", TypeBalance.ElementType.Grass, 300, 300,
                        moves, 3.4f, 3.6f, 3.8f, 3f, 4f);
            }
            case cardiwing -> {
                moves = MovesListGenerator.getMovesList(TypeBalance.ElementType.Flying, amountOfAttacks);
                fakeemon = new Fakeemon("cardiwing", TypeBalance.ElementType.Flying, 280, 280,
                        moves, 3.2f, 3.3f, 3.9f, 5f, 7f);
            }
        }
        return fakeemon;
    }


    public enum eFakeemonID {
        aardart,
        agnite,
        anoleaf,
        bamboon,
        cardiwing
    }
}
