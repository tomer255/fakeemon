package Fakeemon;

import Moves.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovesListGenerator {
    /**
     * Returns shuffled list of moves filtered by type.
     *
     * @param amountOfAttacks - The number of items to be shuffled.
     * @param fakeemonType - The type of move needs to be shuffled.
     */
    public static List<Move> generateMovesList(TypeBalance.ElementType fakeemonType, int amountOfAttacks) {
        List<Move> ShuffeldMoves = new ArrayList<>();
        List<eMoves> MovesEnumArrayList = createMoveListByType(fakeemonType);
        Collections.shuffle(MovesEnumArrayList);
        for (int i = 0; i < amountOfAttacks; i++) {
            ShuffeldMoves.add(generateMove(MovesEnumArrayList.get(i)));
        }
        return ShuffeldMoves;
    }
    /**
     * Generate a move based on the ID of the move.
     *
     * @param moveID - The move's ID.
     */
    public static Move generateMove(eMoves moveID){
        Move move = null;
        switch (moveID){
            case BlazeKick -> move = new BlazeKick();
            case FireSpin -> move = new FireSpin();
            case FlameWheel -> move = new FlameWheel();
            case HeatWave -> move = new HeatWave();
            case OverHeat -> move = new OverHeat();
            case Absorb -> move = new Absorb();
            case BranchPoke -> move = new BranchPoke();
            case GigaDrain -> move = new GigaDrain();
            case RazorLeaf -> move = new RazorLeaf();
            case SeedFlare -> move = new SeedFlare();
            case BouncyBubble -> move = new BouncyBubble();
            case Bubble -> move = new Bubble();
            case BubbleBeam -> move = new BubbleBeam();
            case SplishySplash -> move = new SplishySplash();
            case WaterSpout -> move = new WaterSpout();
            case Nuzzle -> move = new Nuzzle();
            case Thunder -> move = new Thunder();
            case ThunderPunch -> move = new ThunderPunch();
            case ThunderShock -> move = new ThunderShock();
            case VoltTackle -> move = new VoltTackle();
            case Aeroblast -> move = new Aeroblast();
            case AirCutter -> move = new AirCutter();
            case FloatyFall -> move = new FloatyFall();
            case Peck -> move = new Peck();
            case SkyAttack -> move = new SkyAttack();
        }
        return move;
    }

    /**
     * Create a list of moves for a specific type of fakeemon.
     *
     * @param elementType - The fakkemon's type.
     */
    public static List<eMoves> createMoveListByType(TypeBalance.ElementType elementType){
        List<eMoves> eMovesList = null;
        switch (elementType){
            case Fire -> eMovesList = new ArrayList<>(){{
                    add(eMoves.BlazeKick);
                    add(eMoves.FireSpin);
                    add(eMoves.FlameWheel);
                    add(eMoves.HeatWave);
                    add(eMoves.OverHeat);
                }};

            case Grass -> eMovesList = new ArrayList<>(){{
                add(eMoves.Absorb);
                add(eMoves.BranchPoke);
                add(eMoves.GigaDrain);
                add(eMoves.RazorLeaf);
                add(eMoves.SeedFlare);
            }};

            case Water -> eMovesList = new ArrayList<>(){{
                add(eMoves.BouncyBubble);
                add(eMoves.Bubble);
                add(eMoves.BubbleBeam);
                add(eMoves.SplishySplash);
                add(eMoves.WaterSpout);
            }};

            case Electric -> eMovesList = new ArrayList<>(){{
                add(eMoves.Nuzzle);
                add(eMoves.Thunder);
                add(eMoves.ThunderPunch);
                add(eMoves.ThunderShock);
                add(eMoves.VoltTackle);
            }};

            case Flying -> eMovesList = new ArrayList<>(){{
                add(eMoves.Aeroblast);
                add(eMoves.AirCutter);
                add(eMoves.FloatyFall);
                add(eMoves.Peck);
                add(eMoves.SkyAttack);
            }};
        }

        return eMovesList;
    }

    /**
     * Represent moves as an ID.
     */
    public enum eMoves{
        //Fire
        BlazeKick,
        FireSpin,
        FlameWheel,
        HeatWave,
        OverHeat,
        //Grass
        Absorb,
        BranchPoke,
        GigaDrain,
        RazorLeaf,
        SeedFlare,
        //Water
        BouncyBubble,
        Bubble,
        BubbleBeam,
        SplishySplash,
        WaterSpout,
        //Electric
        Nuzzle,
        Thunder,
        ThunderPunch,
        ThunderShock,
        VoltTackle,
        //Flying
        Aeroblast,
        AirCutter,
        FloatyFall,
        Peck,
        SkyAttack
    }
}
