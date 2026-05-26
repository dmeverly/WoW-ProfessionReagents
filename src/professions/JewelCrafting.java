package professions;

import reagents.*;
import java.util.List;

public class JewelCrafting implements Profession {

    // ── Prospecting ──────────────────────────────────────────────────────────
    // Yields uncommon gems, DuskshroudedStone (byproduct), CrystallineGlass (byproduct).
    // EversongDiamond is a rare proc gated behind the Proficient Processor spec tree.
    public List<Gem> prospect(List<Ore> ores) { return null; }
    public DuskshroudedStone prospectDuskshroudedStone(List<Ore> ores) { return null; }
    public CrystallineGlass prospectCrystallineGlass(List<Ore> ores) { return null; }
    public EversongDiamond prospectEversongDiamond(List<Ore> ores) { return null; }  // rare

    // ── Gem processing ───────────────────────────────────────────────────────
    // crush: 3 gems → GlimmeringGemdust (or 1 gem → DuskshroudedStone)
    public GlimmeringGemdust crushGem(Gem gem) { return null; }
    public CutGem cutGem(Gem gem) { return null; }

    // ── Flawless gem processing ──────────────────────────────────────────────
    public CutGem cutFlawlessGem(FlawlessGem gem) { return null; }
    public GlimmeringGemdust crushFlawlessGem(FlawlessGem gem) { return null; }

    // ── Kaleidoscopic Prism ──────────────────────────────────────────────────
    // Craft: 1x each Flawless gem + 10x GlimmeringGemdust → 1x KaleidoscopicPrism
    // Open:  1x KaleidoscopicPrism → 4–6x random FlawlessGem (arbitrage when prism < gem market)
    public KaleidoscopicPrism craftKaleidoscopicPrism(
            FlawlessAmaniLapis lapis,
            FlawlessSanguineGarnet garnet,
            FlawlessHarandarPeridot peridot,
            FlawlessTenebrousAmethyst amethyst,
            List<GlimmeringGemdust> gemdust) { return null; }
    public List<FlawlessGem> openKaleidoscopicPrism(KaleidoscopicPrism prism) { return null; }

    // ── Meta gem cuts (Eversong Diamond) ────────────────────────────────────
    // Requires EversongDiamond (rare prospect) + 2x PetrifiedRoot
    public PowerfulEversongDiamond cutPowerfulEversongDiamond(
            EversongDiamond diamond, List<PetrifiedRoot> roots) { return null; }
    public TelluricEversongDiamond cutTelluricEversongDiamond(
            EversongDiamond diamond, List<PetrifiedRoot> roots) { return null; }
    public StoicEversongDiamond cutStoicEversongDiamond(
            EversongDiamond diamond, List<PetrifiedRoot> roots) { return null; }
    public IndecipherableEversongDiamond cutIndecipherableEversongDiamond(
            EversongDiamond diamond, List<PetrifiedRoot> roots) { return null; }

    // ── Vial & Lens crafting ─────────────────────────────────────────────────
    // SunglassVial → consumed by Alchemy (flasks, phials, potions) AND Enchanting (oils)
    public SunglassVial craftSunglassVial(CrystallineGlass glass) { return null; }
    // Sin'dorei Lens → used in rings, necklaces, and JC housing decor
    public SinDoreiLens craftSinDoreiLens(CrystallineGlass glass) { return null; }

    // ── Housing decor ────────────────────────────────────────────────────────
    // All JC decor requires ThalassianLumber + gems + SinDoreiLens
    // Example: Brilliant Phoenix Harp: 30x ThalassianLumber + 8x SanguineGarnet + 4x SinDoreiLens
    public Decor craftBrilliantPhoenixHarp(
            List<ThalassianLumber> lumber,
            List<SanguineGarnet> garnets,
            List<SinDoreiLens> lenses) { return null; }
}
