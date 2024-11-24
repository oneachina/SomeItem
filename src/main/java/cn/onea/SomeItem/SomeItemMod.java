package cn.onea.SomeItem;

import cn.onea.SomeItem.Item.Someitems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeItemMod implements ModInitializer {
	public static final String MOD_ID = "SomeItem";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello SomeItem world!");
		Someitems.initialize();
	}
}