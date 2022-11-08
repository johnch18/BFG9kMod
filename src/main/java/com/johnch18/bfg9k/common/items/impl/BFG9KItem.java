package com.johnch18.bfg9k.common.items.impl;

import com.johnch18.bfg9k.BFG9KMod;
import com.johnch18.bfg9k.Tags;
import com.johnch18.bfg9k.common.items.IBFG9KItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BFG9KItem extends Item implements IBFG9KItem {

    public BFG9KItem(String unlocalizedName) {
        setUnlocalizedName(unlocalizedName);
        setTextureName(String.format("%s:%s", Tags.MODID, unlocalizedName));
        setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(this, getUnlocalizedName());
    }

}
