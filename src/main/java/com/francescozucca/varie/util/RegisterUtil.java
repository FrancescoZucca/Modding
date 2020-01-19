package com.francescozucca.varie.util;

import com.francescozucca.varie.armor.BaseArmor;
import com.francescozucca.varie.blocks.Blocks;
import com.francescozucca.varie.init.BaseItem;
import com.francescozucca.varie.main.Varie;
import com.francescozucca.varie.tools.*;
import javafx.scene.paint.Material;
import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Francesco on 17/01/2020.
 */
@EventBusSubscriber
public class RegisterUtil {
    @GameRegistry.ObjectHolder(value= Varie.MODID)
    public static class Objects{
        public static final Block enderium_block = null;
        public static final Item enderium_ingot = null;
        public static final Block enderium_ore = null;
        public static final Item enderium_helmet = null;
        public static final Item enderium_chestplate = null;
        public static final Item enderium_leggings = null;
        public static final Item enderium_boots = null;
        public static final Item enderium_pickaxe = null;
        public static final Item enderium_axe = null;
        public static final Item enderium_sword = null;
        public static final Item enderium_shovel = null;
        public static final Item enderium_hoe = null;
    }
    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(Blocks.EnderiumBlock, Blocks.EnderiumOre);
    }
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                getItemBlock(Blocks.EnderiumBlock),
                new BaseItem("enderium_ingot"),
                getItemBlock(Blocks.EnderiumOre),
                new BaseArmor(BaseArmor.ENDERIUM_ARMOR, EntityEquipmentSlot.HEAD, "enderium_helmet"),
                new BaseArmor(BaseArmor.ENDERIUM_ARMOR, EntityEquipmentSlot.CHEST, "enderium_chestplate"),
                new BaseArmor(BaseArmor.ENDERIUM_ARMOR, EntityEquipmentSlot.LEGS, "enderium_leggings"),
                new BaseArmor(BaseArmor.ENDERIUM_ARMOR, EntityEquipmentSlot.FEET, "enderium_boots"),
                new BasePickaxe(Materials.ENDERIUM, "enderium_pickaxe"),
                new BaseAxe(Materials.ENDERIUM, "enderium_axe"),
                new BaseHoe(Materials.ENDERIUM, "enderium_hoe"),
                new BaseSpade(Materials.ENDERIUM, "enderium_shovel"),
                new BaseSword(Materials.ENDERIUM, "enderium_sword")
        );
    }
    public static Item getItemBlock(Block block){
        return new ItemBlock(block).setRegistryName(block.getRegistryName());
    }

}
