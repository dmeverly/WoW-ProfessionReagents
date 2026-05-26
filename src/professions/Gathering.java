package professions;

import reagents.Reagent;
import java.util.List;

public abstract class Gathering implements Profession {
    public abstract List<? extends Reagent> gather();
}
