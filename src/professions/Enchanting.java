package professions;

import reagents.*;
import java.util.List;

public class Enchanting implements Profession {

    // ── Disenchanting → materials by gear quality ─────────────────────────────
    public EversingingDust disenchantCommon() { return null; }
    public RadiantShard disenchantRare() { return null; }
    public DawnCrystal disenchantEpic() { return null; }

    // ── Material conversions (downgrade) ─────────────────────────────────────
    public List<RadiantShard> shatter(DawnCrystal crystal) { return null; }
    public List<EversingingDust> pulverize(RadiantShard shard) { return null; }

    // ── Oils ─────────────────────────────────────────────────────────────────
    // Thalassian Phoenix Oil: 5x MoteOfLight + 1x SunglassVial (JC) + 5x EversingingDust
    public ThalassianPhoenixOil craftPhoenixOil(
            List<MoteOfLight> motes,
            SunglassVial vial,
            List<EversingingDust> dust) { return null; }

    // Oil of Dawn (healer oil): 5x MoteOfLight + 2x PetrifiedRoot + 1x SunglassVial (JC) + 5x EversingingDust
    public OilOfDawn craftOilOfDawn(
            List<MoteOfLight> motes,
            List<PetrifiedRoot> roots,
            SunglassVial vial,
            List<EversingingDust> dust) { return null; }

    // ── High-tier weapon enchants ─────────────────────────────────────────────
    // Arcane Mastery: 5x MoteOfLight + 4x PetrifiedRoot + 2x ArcanoweaveRolt (Tailoring)
    //                 + 20x EversingingDust + 15x RadiantShard + 2x DawnCrystal
    public EnchantWeaponArcaneMastery craftArcaneMasteryEnchant(
            List<MoteOfLight> motes,
            List<PetrifiedRoot> roots,
            List<ArcanoweaveRolt> cloth,
            List<EversingingDust> dust,
            List<RadiantShard> shards,
            List<DawnCrystal> crystals) { return null; }

    // Flames of the Sin'dorei: 5x MoteOfLight + 4x PetrifiedRoot + 2x SunfireSilkBolt (Tailoring)
    //                          + 25x EversingingDust + 15x RadiantShard + 2x DawnCrystal
    public EnchantWeaponFlamesOfSinDorei craftFlamesEnchant(
            List<MoteOfLight> motes,
            List<PetrifiedRoot> roots,
            List<SunfireSilkBolt> cloth,
            List<EversingingDust> dust,
            List<RadiantShard> shards,
            List<DawnCrystal> crystals) { return null; }

    // ── Ring enchants (high volume, steady AH income) ────────────────────────
    public Enchant craftRingEnchant(List<EversingingDust> dust) { return null; }
}
