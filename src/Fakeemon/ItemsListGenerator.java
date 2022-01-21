package Fakeemon;

import Item.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemsListGenerator {

    /**
     * Returns shuffled list of bag items.
     *
     * @param amountOfItems - The number of items to be shuffled.
     */
    public static List<Iitem> generateItemsList(int amountOfItems) {
        List<Iitem> ShuffeldItems = new ArrayList<>();
        List<eItems> ItemsEnumArrayList = createItemList();
        Collections.shuffle(ItemsEnumArrayList);
        for (int i = 0; i < amountOfItems; i++) {
            ShuffeldItems.add(generateItem(ItemsEnumArrayList.get(i)));
        }
        return ShuffeldItems;
    }

    /**
     * Generate an item based on an item's ID.
     *
     * @param itemID - The item's ID.
     */
    public static Iitem generateItem(eItems itemID) {
        Iitem item = null;
        switch (itemID) {
            case Iron -> item = new Iron();
            case Zinc -> item = new Zinc();
            case QuickCandy -> item = new QuickCandy();
            case AssaultVest -> item = new AssaultVest();
            case HealthCandy -> item = new HealthCandy();
            case QuickCandyL -> item = new QuickCandyL();
            case HealthCandyL -> item = new HealthCandyL();
            case QuickCandyXL -> item = new QuickCandyXL();
            case HealthCandyXL -> item = new HealthCandyXL();
        }
        return item;
    }

    /**
     * Create a list of items.
     */
    public static List<eItems> createItemList() {
        List<eItems> eItemsList = new ArrayList<>();
        eItemsList.add(eItems.AssaultVest);
        eItemsList.add(eItems.HealthCandy);
        eItemsList.add(eItems.HealthCandyL);
        eItemsList.add(eItems.Iron);
        eItemsList.add(eItems.HealthCandyXL);
        eItemsList.add(eItems.QuickCandy);
        eItemsList.add(eItems.QuickCandyL);
        eItemsList.add(eItems.QuickCandyXL);
        eItemsList.add(eItems.Zinc);

        return eItemsList;
    }

    /**
     * Represent bag items as an ID.
     */
    public enum eItems {
        AssaultVest,
        HealthCandy,
        HealthCandyL,
        HealthCandyXL,
        Iron,
        QuickCandy,
        QuickCandyL,
        QuickCandyXL,
        Zinc

    }
}
