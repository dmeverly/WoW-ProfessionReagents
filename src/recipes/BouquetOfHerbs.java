package recipes;

import reagents.Herb;
import reagents.Reagent;
import java.util.List;

public class BouquetOfHerbs extends Recipe {
    @SuppressWarnings("unused")
    private final List<Herb> herbs;

    public BouquetOfHerbs(List<Herb> herbs) {
        this.herbs = herbs;
    }

    @Override
    public Reagent craft() { return null; }
}
