package com.francescozucca.varie.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

/**
 * Created by Francesco on 18/01/2020.
 */
public class BaseHoe extends ItemHoe {
    public BaseHoe(ToolMaterial material, String name){
        super(material);
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
