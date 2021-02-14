package io.github.gmasterhd.notenoughskyblock;

import lombok.Getter;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NotEnoughSkyBlock.MODID, version = NotEnoughSkyBlock.VERSION, clientSideOnly = true)
public class NotEnoughSkyBlock {
	public static final String MODID = "notenoughskyblock";
	public static final String VERSION = "0.1";
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	}
}
