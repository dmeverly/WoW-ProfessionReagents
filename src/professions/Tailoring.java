package professions;

import reagents.*;
import java.util.List;

public class Tailoring extends Gathering {
    @Override
    public List<Cloth> gather() { return null; }

    // ── Cloth processing ──────────────────────────────────────────────────────
    // BrightLinen drops from humanoid mobs throughout Midnight zones.
    // Arcanoweave and SunfireSilk are spec-gated (Nimble Needlework, 20 KP).
    public BrightLinenBolt weaveBrightLinenBolt(List<BrightLinen> linen) { return null; }
    public ImbuedBrightLinenBolt imbueBrightLinenBolt(List<BrightLinenBolt> bolts) { return null; }

    // ── Daily CD bolts (used in high-tier Enchanting weapon enchants) ─────────
    // ArcanoweaveRolt:  4x MoteOfWildMagic + 5x Arcanoweave + 6x ImbuedBrightLinenBolt  (~17 hr CD)
    // SunfireSilkBolt:  4x MoteOfLight     + 5x SunfireSilk + 6x ImbuedBrightLinenBolt  (~17 hr CD)
    public ArcanoweaveRolt craftArcanoweaveRolt(
            List<MoteOfWildMagic> motes,
            List<Arcanoweave> cloth,
            List<ImbuedBrightLinenBolt> linens) { return null; }

    public SunfireSilkBolt craftSunfireSilkBolt(
            List<MoteOfLight> motes,
            List<SunfireSilk> cloth,
            List<ImbuedBrightLinenBolt> linens) { return null; }
}
