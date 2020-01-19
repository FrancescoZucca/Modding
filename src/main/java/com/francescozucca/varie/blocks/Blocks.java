package com.francescozucca.varie.blocks;

import com.francescozucca.varie.init.BaseBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Francesco on 16/01/2020.
 */
public class Blocks {
    public static Block EnderiumBlock = new BaseBlock("enderium_block", 10, 50, CreativeTabs.BUILDING_BLOCKS, Material.IRON, "pickaxe", 3);
    public static Block EnderiumOre = new BaseBlock("enderium_ore", 10, 50, CreativeTabs.BUILDING_BLOCKS, Material.ROCK, "pickaxe", 3);
}
