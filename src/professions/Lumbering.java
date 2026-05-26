package professions;

import reagents.Lumber;
import reagents.ThalassianLumber;
import reagents.FelwoodLumber;
import java.util.List;

public class Lumbering extends Gathering {
    @Override
    public List<Lumber> gather() { return null; }

    public ThalassianLumber chopThalassian() { return null; }
    public FelwoodLumber chopFelwood() { return null; }
}
