package com.francescozucca.varie.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * Created by Francesco Z. on 16/01/2020
 */
public class BaseBlock extends Block {
    public BaseBlock(String name, float hardness, float resistance, CreativeTabs tab, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setCreativeTab(tab);
        setResistance(resistance);
    }
    public BaseBlock(String name, float hardness, float resistance, CreativeTabs tab, Material material, String tool, int level) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setCreativeTab(tab);
        setResistance(resistance);
        setHarvestLevel(tool, level);
    }
    public BaseBlock(){
        super(Material.ROCK);
        setRegistryName("test_block");
        setUnlocalizedName(this.getRegistryName().toString());
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}