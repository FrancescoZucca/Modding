package com.francescozucca.varie.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by Francesco on 18/01/2020.
 */
public class BaseSword extends ItemSword {
    public BaseSword(ToolMaterial material, String name){
        super(material);
        setCreativeTab(CreativeTabs.COMBAT);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
