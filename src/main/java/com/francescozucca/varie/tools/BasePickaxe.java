package com.francescozucca.varie.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Francesco on 18/01/2020.
 */
public class BasePickaxe extends ItemPickaxe {
    public BasePickaxe(ToolMaterial material, String name){
        super(material);
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
