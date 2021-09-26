package net.danielgolan.elderion;

import net.danielgolan.elderion.blocks.VariedBlock;
import net.fabricmc.api.ModInitializer;

import static net.danielgolan.elderion.ElderionAuthor.*;
import static net.minecraft.block.Blocks.*;

public class Elderion implements ModInitializer {
    public static final String MOD_ID = "elderion";

    public static final VariedBlock CHISELED_END_STONE;
    public static final VariedBlock CHISELED_END_STONE_BRICKS;
    public static final VariedBlock CHISELED_OBSIDIAN;
    public static final VariedBlock CHISELED_PURPUR_BRICKS;
    public static final VariedBlock CHISELED_PURPUR_PILLAR;
    public static final VariedBlock CHISELED_WAXED_OXIDIZED_COPPER;
    public static final VariedBlock CHISELED_WAXED_WEATHERED_COPPER;
    public static final VariedBlock CORRUPTED_COPPER;
    public static final VariedBlock CUT_PRISMARINE;
    public static final VariedBlock CUT_PRISMARINE_BRICKS;
    public static final VariedBlock DIMMED_GLOWSTONE;
    public static final VariedBlock ILLUMINATED_DARK_PRISMARINE;
    public static final VariedBlock POLISHED_OBSIDIAN;
    public static final VariedBlock POLISHED_PRISMARINE;
    public static final VariedBlock POLISHED_PRISMARINE_BRICKS;
    public static final VariedBlock CUT_EMERALD;
    public static final VariedBlock CUT_AMETHYST;
    public static final VariedBlock CUT_IRON;
    public static final VariedBlock CUT_NETHERITE;
    public static final VariedBlock CUT_GOLD;
    public static final VariedBlock CUT_DIAMOND;
    public static final VariedBlock CUT_LAPIS_LAZULI;
    public static final VariedBlock CUT_REDSTONE;
    public static final VariedBlock SMOOTH_AMETHYST;

    public void onInitialize() { }

    static {
        CHISELED_END_STONE = VariedBlock.of(END_STONE)
                .build(canedpeanutshels, "chiseled_end_stone").register();
        CHISELED_END_STONE_BRICKS = VariedBlock.of(END_STONE_BRICKS)
                .build(canedpeanutshels, "chiseled_end_stone_bricks").register();
        POLISHED_OBSIDIAN = VariedBlock.of(OBSIDIAN)
                .build(canedpeanutshels, "polished_obsidian").register();
        CHISELED_OBSIDIAN = VariedBlock.of(OBSIDIAN)
                .build(canedpeanutshels, "chiseled_obsidian").register();
        CHISELED_PURPUR_BRICKS = VariedBlock.of(PURPUR_BLOCK)
                .build(canedpeanutshels, "chiseled_purpur_bricks").register();
        CHISELED_PURPUR_PILLAR = VariedBlock.of(PURPUR_BLOCK)
                .build(canedpeanutshels, "chiseled_purpur_pillar").register();
        CHISELED_WAXED_OXIDIZED_COPPER = VariedBlock.of(WAXED_OXIDIZED_COPPER)
                .build(canedpeanutshels, "chiseled_waxed_oxidized_copper").register();
        CHISELED_WAXED_WEATHERED_COPPER = VariedBlock.of(WAXED_WEATHERED_COPPER)
                .build(canedpeanutshels, "chiseled_waxed_weathered_copper").register();
        DIMMED_GLOWSTONE = VariedBlock.of(GLOWSTONE)
                .luminance(13)
                .build(canedpeanutshels, "dimmed_glowstone").register();
        ILLUMINATED_DARK_PRISMARINE = VariedBlock.of(DARK_PRISMARINE)
                .luminance(15)
                .build(canedpeanutshels, "illuminated_dark_prismarine").register();
        POLISHED_PRISMARINE_BRICKS = VariedBlock.of(PRISMARINE_BRICKS)
                .build(canedpeanutshels, "polished_prismarine_bricks").register();
        CUT_PRISMARINE = VariedBlock.of(PRISMARINE)
                .build(canedpeanutshels, "cut_prismarine").register();
        CORRUPTED_COPPER = VariedBlock.of(WAXED_COPPER_BLOCK)
                .build(canedpeanutshels, "corrupted_copper").register();
        CUT_PRISMARINE_BRICKS = VariedBlock.of(PRISMARINE_BRICKS)
                .build(canedpeanutshels, "cut_prismarine_bricks").register();
        POLISHED_PRISMARINE = VariedBlock.of(PRISMARINE)
                .build(canedpeanutshels, "polished_prismarine").register();
        CUT_EMERALD = VariedBlock.of(EMERALD_BLOCK)
                .build(crystalline_robin, "cut_emerald").register();
        CUT_AMETHYST = VariedBlock.of(AMETHYST_BLOCK)
                .build(crystalline_robin, "cut_amethyst").register();
        CUT_IRON = VariedBlock.of(IRON_BLOCK)
                .build(crystalline_robin, "cut_iron_block");
        CUT_NETHERITE = VariedBlock.of(NETHERITE_BLOCK)
                .build(crystalline_robin, "cut_netherite").register();
        CUT_GOLD = VariedBlock.of(GOLD_BLOCK)
                .build(crystalline_robin, "cut_gold").register();
        CUT_DIAMOND = VariedBlock.of(DIAMOND_BLOCK)
                .build(crystalline_robin, "cut_diamond").register();
        CUT_LAPIS_LAZULI = VariedBlock.of(LAPIS_BLOCK)
                .build(crystalline_robin, "cut_lapis_lazuli").register();
        CUT_REDSTONE = VariedBlock.of(REDSTONE_BLOCK)
                .build(crystalline_robin, "cut_redstone").register();
        SMOOTH_AMETHYST = VariedBlock.of(AMETHYST_BLOCK)
                .build(canedpeanutshels, "smooth_amethyst").register();
    }
}
