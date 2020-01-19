package com.francescozucca.varie.util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by Francesco on 17/01/2020.
 */
@Mod.EventBusSubscriber(value= Side.CLIENT)
public class RenderUtil {
    @SubscribeEvent
    public static void registerBlockRenderer(ModelRegistryEvent event){
        setRender(RegisterUtil.Objects.enderium_block);
        setRender(RegisterUtil.Objects.enderium_ore);
    }
    @SubscribeEvent
    public static void registerItemRenderer(ModelRegistryEvent event){
        setRender(RegisterUtil.Objects.enderium_ingot);
        setRender(RegisterUtil.Objects.enderium_helmet);
        setRender(RegisterUtil.Objects.enderium_chestplate);
        setRender(RegisterUtil.Objects.enderium_leggings);
        setRender(RegisterUtil.Objects.enderium_boots);
        setRender(RegisterUtil.Objects.enderium_sword);
        setRender(RegisterUtil.Objects.enderium_shovel);
        setRender(RegisterUtil.Objects.enderium_pickaxe);
        setRender(RegisterUtil.Objects.enderium_axe);
        setRender(RegisterUtil.Objects.enderium_hoe);
    }
    public static void setRender(Block block){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
    public static void setRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
