package com.francescozucca.varie.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

/**
 * Created by Francesco on 18/01/2020.
 */
public class BaseAxe extends ItemAxe {
    public BaseAxe(ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setCreativeTab(CreativeTabs.TOOLS);
    }

    public BaseAxe(ToolMaterial material, String name) {
        this(material, 8.0F, -3.1F);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }
}
