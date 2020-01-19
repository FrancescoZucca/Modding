package com.francescozucca.varie.armor;

import com.francescozucca.varie.main.Varie;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;

/**
 * Created by Francesco on 18/01/2020.
 */
public class BaseArmor extends ItemArmor {
    private static ArrayList armorIndex = new ArrayList();
    public static ArmorMaterial ENDERIUM_ARMOR = EnumHelper.addArmorMaterial("varie:enderium_armor","varie:enderium_armor", 20, new int[]{4,9,7,3}, 7, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3);
    public BaseArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name){
        super(material, 0, slot);
        setCreativeTab(CreativeTabs.COMBAT);

        setUnlocalizedName(Varie.MODID + "." + name);
        setRegistryName(name);
    }
}
