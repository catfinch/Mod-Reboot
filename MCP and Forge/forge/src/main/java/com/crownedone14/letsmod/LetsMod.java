package com.crownedone14.letsmod;

import com.crownedone14.letsmod.proxy.IProxy;
import com.crownedone14.letsmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsMod instance;

    @SidedProxy(clientSide = "com.crownedone14.letsmod.proxy.clientProxy", serverSide = "com.crownedone14.letsmod.proxy.serverProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
