package professions;

import reagents.*;
import java.util.List;

public class Alchemy implements Profession {

    // ── Mote transmutations (circular cycle, each requires 2x StabilizedDerivate) ──
    // Light ↔ PrimalEnergy ↔ PureVoid ↔ WildMagic ↔ Light
    public MoteOfLight transmuteMoteOfLight(List<MoteOfPrimalEnergy> motes, List<StabilizedDerivate> derivates) { return null; }
    public MoteOfPrimalEnergy transmuteMoteOfPrimalEnergy(List<MoteOfPureVoid> motes, List<StabilizedDerivate> derivates) { return null; }
    public MoteOfPureVoid transmuteMoteOfPureVoid(List<MoteOfWildMagic> motes, List<StabilizedDerivate> derivates) { return null; }
    public MoteOfWildMagic transmuteMoteOfWildMagic(List<MoteOfLight> motes, List<StabilizedDerivate> derivates) { return null; }

    // ── Stabilized Derivate ──────────────────────────────────────────────────
    // NOT crafted directly — obtained by recycling crafted flasks or potions
    public StabilizedDerivate recycleFlask(Flask flask) { return null; }
    public StabilizedDerivate recyclePotion(Potion potion) { return null; }

    // ── Composite Flora (transmutation) ─────────────────────────────────────
    // 4x MoteOfWildMagic + 4x MoteOfPrimalEnergy + 6x TranquilityBloom + 4x Argentleaf
    public CompositeFlora craftCompositeFlora(
            List<MoteOfWildMagic> wildMagicMotes,
            List<MoteOfPrimalEnergy> primalMotes,
            List<TranquilityBloom> bloom,
            List<Argentleaf> argentleaf) { return null; }

    // ── Wondrous Synergist (18 hr CD) ───────────────────────────────────────
    // 4x StabilizedDerivate + 2x each of TranquilityBloom, Sanguithorn, Azeroot, Argentleaf, ManaLily
    public WondrousSynergist craftWondrousSynergist(
            List<StabilizedDerivate> derivates,
            List<TranquilityBloom> bloom,
            List<Sanguithorn> sanguithorn,
            List<Azeroot> azeroot,
            List<Argentleaf> argentleaf,
            List<ManaLily> manaLily) { return null; }

    // ── Potions ──────────────────────────────────────────────────────────────
    // All potions: Herbs + Mote + 5x SunglassVial (cross-profession from JewelCrafting)
    public LightsPotential craftLightsPotential(
            MoteOfLight mote,
            List<TranquilityBloom> bloom,
            List<Azeroot> azeroot,
            List<Argentleaf> argentleaf,
            List<SunglassVial> vials) { return null; }

    public PotionOfRecklessness craftPotionOfRecklessness(
            List<MoteOfPrimalEnergy> motes,
            List<TranquilityBloom> bloom,
            List<Azeroot> azeroot,
            List<SunglassVial> vials) { return null; }

    public VoidShroudedTincture craftVoidShroudedTincture(
            List<MoteOfPureVoid> motes,
            List<TranquilityBloom> bloom,
            List<Sanguithorn> sanguithorn,
            List<SunglassVial> vials) { return null; }

    // ── Phials ───────────────────────────────────────────────────────────────
    // All phials: Mote + Herbs + 4x SunglassVial (cross-profession from JewelCrafting)
    public HaranirPhialOfFinesse craftPhialOfFinesse(
            List<MoteOfPrimalEnergy> motes,
            List<TranquilityBloom> bloom,
            List<Azeroot> azeroot,
            List<ManaLily> manaLily,
            List<SunglassVial> vials) { return null; }

    public HaranirPhialOfIngenuity craftPhialOfIngenuity(
            List<MoteOfPureVoid> motes,
            List<TranquilityBloom> bloom,
            List<Sanguithorn> sanguithorn,
            List<ManaLily> manaLily,
            List<SunglassVial> vials) { return null; }

    public HaranirPhialOfPerception craftPhialOfPerception(
            List<MoteOfWildMagic> motes,
            List<TranquilityBloom> bloom,
            List<Azeroot> azeroot,
            List<Argentleaf> argentleaf,
            List<SunglassVial> vials) { return null; }

    // ── Flasks ───────────────────────────────────────────────────────────────
    // All flasks: NocturnalLotus (rare) + Mote + Herbs + 2x SunglassVial
    public FlaskOfTheBloodKnights craftFlaskOfBloodKnights(
            NocturnalLotus lotus,
            List<MoteOfWildMagic> motes,
            List<Sanguithorn> sanguithorn,
            List<Argentleaf> argentleaf,
            List<SunglassVial> vials) { return null; }

    public FlaskOfTheMagisters craftFlaskOfMagisters(
            NocturnalLotus lotus,
            List<MoteOfPureVoid> motes,
            List<Sanguithorn> sanguithorn,
            List<ManaLily> manaLily,
            List<SunglassVial> vials) { return null; }

    public FlaskOfTheShatteredSun craftFlaskOfShatteredSun(
            NocturnalLotus lotus,
            List<MoteOfPrimalEnergy> motes,
            List<Azeroot> azeroot,
            List<Argentleaf> argentleaf,
            List<SunglassVial> vials) { return null; }

    public FlaskOfThalassianResistance craftFlaskOfThalassianResistance(
            NocturnalLotus lotus,
            List<MoteOfLight> motes,
            List<Azeroot> azeroot,
            List<ManaLily> manaLily,
            List<SunglassVial> vials) { return null; }

    // ── Cauldrons (raid gold-sink) ───────────────────────────────────────────
    // Both cauldrons: NocturnalLotus + 5x StabilizedDerivate + 4x PetrifiedRoot
    //                 + 20x SunglassVial + 4x WondrousSynergist
    public CauldronOfSinDoreiFlasks craftFlaskCauldron(
            NocturnalLotus lotus,
            List<StabilizedDerivate> derivates,
            List<PetrifiedRoot> roots,
            List<SunglassVial> vials,
            List<WondrousSynergist> synergists) { return null; }

    public VoidlightPotionCauldron craftPotionCauldron(
            NocturnalLotus lotus,
            List<StabilizedDerivate> derivates,
            List<PetrifiedRoot> roots,
            List<SunglassVial> vials,
            List<WondrousSynergist> synergists) { return null; }

    // ── School of Gems (cross-profession) ───────────────────────────────────
    // Fishing + Alchemy: Fish + 1x StabilizedDerivate + 3x CompositeFlora
    // → container that produces random gems (uncommon + Flawless)
    public SchoolOfGems craftSchoolOfGems(
            List<EversongTrout> trout,
            List<BloomtailMinnow> minnow,
            List<SinDoreiSwarmer> swarmers,
            StabilizedDerivate derivate,
            List<CompositeFlora> flora) { return null; }

    // ── Alchemist Stones (epic trinkets) ─────────────────────────────────────
    public PrimalPhilosophersStone craftPrimalPhilosophersStone(
            List<StabilizedDerivate> derivates,
            List<MoteOfLight> motes) { return null; }

    // Requires TormentedTantalum (rare Mining ore) — gated epic trinket
    public MagisterAlchemistStone craftMagisterAlchemistStone(
            List<StabilizedDerivate> derivates,
            List<MoteOfPrimalEnergy> primalMotes,
            List<MoteOfWildMagic> wildMotes,
            TormentedTantalum tantalum,
            List<WondrousSynergist> synergists) { return null; }

    // ── Housing decor ────────────────────────────────────────────────────────
    // All decor: WondrousSynergist + CompositeFlora + ThalassianLumber + specific Motes
    public SunsmokeCenser craftSunsmokeCenser(
            List<MoteOfLight> motes,
            List<ThalassianLumber> lumber,
            List<CompositeFlora> flora,
            List<WondrousSynergist> synergists) { return null; }

    public SilvermoonSpireFountain craftFountain(
            List<MoteOfWildMagic> wildMotes,
            List<MoteOfPrimalEnergy> primalMotes,
            List<ThalassianLumber> lumber,
            List<CompositeFlora> flora,
            List<WondrousSynergist> synergists) { return null; }

    public EntropicIlluminant craftEntropicIlluminant(
            List<MoteOfPureVoid> motes,
            List<ThalassianLumber> lumber,
            List<CompositeFlora> flora,
            List<WondrousSynergist> synergists) { return null; }

    public RootboundVat craftRootboundVat(
            List<MoteOfPrimalEnergy> motes,
            List<ThalassianLumber> lumber,
            List<CompositeFlora> flora,
            List<WondrousSynergist> synergists) { return null; }
}
