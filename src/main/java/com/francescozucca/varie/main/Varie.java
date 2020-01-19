package com.francescozucca.varie.main;

import com.francescozucca.varie.blocks.Blocks;
import com.francescozucca.varie.proxies.ServerProxy;
import com.francescozucca.varie.util.RegisterUtil;
import com.francescozucca.varie.worldgen.OreGen;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Varie.MODID, name = Varie.NAME, version = Varie.VERSION, certificateFingerprint = "374709e4f837b70bcacae7c89895ec34a02c2153")
public class Varie
{
    public static final String MODID = "varie";
    public static final String NAME = "Varie";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(MODID)
    public static Varie instance;

    @SidedProxy(clientSide="com.francescozucca.varie.proxies.ClientProxy", serverSide = "com.francescozucca.varie.proxies.ServerProxy")
    public static ServerProxy proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(new ItemStack(Blocks.EnderiumOre), new ItemStack(RegisterUtil.Objects.enderium_ingot), 100);
        GameRegistry.registerWorldGenerator(new OreGen(), 1);
        logger.info("Initialize!");
    }
    @EventHandler
    public void killMinecraft(FMLFingerprintViolationEvent event){
        if(!event.isDirectory()) {
            int goodbye = 1337 / 0;
        }
    }

}
