package Fakeemon;

import Moves.Move;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FakeemonGenerator {

    public static List<Fakeemon> generateFakeemonsList(int amountOfFakeemons) {
        List<Fakeemon> fakeemonsList = new ArrayList<>();
        List<eFakeemonID> fakeemonsEnumList = CreateFakeemonsList();
        Collections.shuffle(fakeemonsEnumList);
        for (int i = 0; i < amountOfFakeemons; i++) {
            fakeemonsList.add(generateFakeemon(fakeemonsEnumList.get(i)));
        }
            return fakeemonsList;
    }

    /**
     * Generate a fakeemon based on the fakkemon's ID.
     *
     * @param fakeemonName - The fakeemon's name.
     */
    public static Fakeemon generateFakeemon(FakeemonGenerator.eFakeemonID fakeemonName) {
        int amountOfAttacks = 4;
        Fakeemon fakeemon = null;
        List<Move> moves;
        switch (fakeemonName) {
            case aardart -> {
                moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Electric, amountOfAttacks);
                fakeemon = new Fakeemon("aardart", TypeBalance.ElementType.Electric, 320, 320,
                        moves, 3.3f, 3.5f, 3.4f, 3.2f, 5.4f);
            }
            case agnite -> {
                moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Fire, amountOfAttacks);
                fakeemon = new Fakeemon("agnite", TypeBalance.ElementType.Fire, 260, 260,
                        moves, 3.7f, 3.4f, 3.8f, 3f, 5f);
            }
            case anoleaf -> {
                moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Water, amountOfAttacks);
                fakeemon = new Fakeemon("anoleaf", TypeBalance.ElementType.Water, 350, 350,
                        moves, 3.5f, 3.8f, 3.4f, 3f, 5f);
            }
            case bamboon -> {
                moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Grass, amountOfAttacks);
                fakeemon = new Fakeemon("bamboon", TypeBalance.ElementType.Grass, 300, 300,
                        moves, 3.4f, 3.6f, 3.8f, 3f, 4f);
            }
            case cardiwing -> {
                moves = MovesListGenerator.generateMovesList(TypeBalance.ElementType.Flying, amountOfAttacks);
                fakeemon = new Fakeemon("cardiwing", TypeBalance.ElementType.Flying, 280, 280,
                        moves, 3.2f, 3.3f, 3.9f, 5f, 7f);
            }
        }
        return fakeemon;
    }

    /**
     * Create a list of the fakeemons available for use.
     */
    public static List<eFakeemonID> CreateFakeemonsList() {
        List<eFakeemonID> eFakeemonList = new ArrayList<>();
        eFakeemonList.add(eFakeemonID.agnite);
        eFakeemonList.add(eFakeemonID.aardart);
        eFakeemonList.add(eFakeemonID.anoleaf);
        eFakeemonList.add(eFakeemonID.bamboon);
        eFakeemonList.add(eFakeemonID.cardiwing);

        return eFakeemonList;
    }

    /**
     * Represent fakeemons as an ID.
     */
    public enum eFakeemonID {
        aardart,
        agnite,
        anoleaf,
        bamboon,
        cardiwing
    }
}
