package net.fancy_socks.waterlogged.world.biome;

import net.fancy_socks.waterlogged.Waterlogged;
import net.fancy_socks.waterlogged.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(Waterlogged.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Waterlogged.MOD_ID, ModMaterialRules.makeRules());
    }
}
