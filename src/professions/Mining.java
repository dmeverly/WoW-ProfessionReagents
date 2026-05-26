package professions;

import reagents.*;
import java.util.List;

public class Mining extends Gathering {
    @Override
    public List<Ore> gather() { return null; }

    public RefulgentCopperOre mineRefulgentCopper() { return null; }
    public UmbralTinOre mineUmbralTin() { return null; }
    public BrilliantSilverOre mineBrilliantSilver() { return null; }
    public DazzlingThorium mineDazzlingThorium() { return null; }
    // Rare ore needed for Magister's Alchemist Stone epic trinket
    public TormentedTantalum mineTormentedTantalum() { return null; }
    public Mote collectMote() { return null; }

    public RefulgentCopperIngot smelt(RefulgentCopperOre ore) { return null; }
    public UmbralTinIngot smelt(UmbralTinOre ore) { return null; }
    public BrilliantSilverIngot smelt(BrilliantSilverOre ore) { return null; }
}
