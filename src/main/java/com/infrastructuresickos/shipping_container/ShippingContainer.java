package com.infrastructuresickos.shipping_container;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ShippingContainer.MOD_ID)
public class ShippingContainer {
    public static final String MOD_ID = "shipping_container";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public ShippingContainer() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("ShippingContainer initialized");
    }
}
