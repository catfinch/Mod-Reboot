package com.crownedone14.letsmod.handler;

import com.crownedone14.letsmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;
    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration  = new Configuration(configFile);
            loadConfigurations();
        }
    }


    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfigurations();
        }
    }

    private static void loadConfigurations()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
