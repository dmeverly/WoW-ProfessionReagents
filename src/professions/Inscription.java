package professions;

import reagents.*;
import java.util.List;

public class Inscription implements Profession {

    // ── Milling: each herb yields its own pigment ─────────────────────────────
    public PowderPigment millTranquilityBloom(List<TranquilityBloom> herbs) { return null; }
    public ArgentleafPigment millArgentleaf(List<Argentleaf> herbs) { return null; }
    public ManaLilyPigment millManaLily(List<ManaLily> herbs) { return null; }
    public SanguithornPigment millSanguithorn(List<Sanguithorn> herbs) { return null; }

    // ── Ink crafting (each uses 3x ThalassianSongwater + pigments) ──────────
    // Sienna Ink:  3x Songwater + 20x PowderPigment + 10x ArgentleafPigment + 5x ManaLilyPigment
    public SiennaInk craftSiennaInk(
            List<ThalassianSongwater> songwater,
            List<PowderPigment> powder,
            List<ArgentleafPigment> argentleaf,
            List<ManaLilyPigment> manaLily) { return null; }

    // Munsell Ink: 3x Songwater + 20x PowderPigment + 10x SanguithornPigment + 5x ManaLilyPigment
    public MunsellInk craftMunsellInk(
            List<ThalassianSongwater> songwater,
            List<PowderPigment> powder,
            List<SanguithornPigment> sanguithorn,
            List<ManaLilyPigment> manaLily) { return null; }

    // ── Missives ──────────────────────────────────────────────────────────────
    // 2x MunsellInk + 2x SiennaInk + 1x MoteOfPureVoid
    // (some variants swap in MoteOfPrimalEnergy + LexicologistVellum)
    public ThalassianMissive craftMissive(
            List<MunsellInk> munsellInk,
            List<SiennaInk> siennaInk,
            MoteOfPureVoid mote) { return null; }

    // ── Soul Cipher (cross-profession: requires DuskshroudedStone from JewelCrafting) ──
    // 1x MoteOfPureVoid + 1x MoteOfLight + 1x DuskshroudedStone + 1x MunsellInk + 1x SiennaInk
    public SoulCipher craftSoulCipher(
            MoteOfPureVoid voidMote,
            MoteOfLight lightMote,
            DuskshroudedStone stone,
            MunsellInk munsellInk,
            SiennaInk siennaInk) { return null; }

    // ── Darkmoon cards & decks ────────────────────────────────────────────────
    // Random card from a suit (Blood/Hunt/Rot/Void): Munsell or Sienna Ink
    // Alternatively ThalassianEssenceOfTheFaire unlocks from Darkmoon Curiosity spec
    public DarkmoonCard craftDarkmoonCard(
            List<Ink> inks,
            ThalassianEssenceOfTheFaire essence) { return null; }

    // Assemble 8 cards of the same suit → DarkmoonDeck trinket
    public DarkmoonDeck assembleDarkmoonDeck(List<DarkmoonCard> cards) { return null; }

    // ── Faction contracts ─────────────────────────────────────────────────────
    public Contract craftContract(List<Ink> inks) { return null; }

    // ── ThalassianSongwater (vendor-bought solvent, not crafted from herbs) ──
    // Listed here as a reminder that it's purchased, not crafted
    // Kept for documentary completeness; use Purchase.buyFromVendor("Thalassian Songwater")
}
