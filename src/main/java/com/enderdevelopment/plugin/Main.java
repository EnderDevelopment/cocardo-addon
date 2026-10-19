package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("CocardosPlugin has been enabled!");
        this.getCommand("cocardos").setExecutor(new CocardosCommand());
        this.getCommand("equip").setExecutor(new EquipCommand());
        this.getCommand("share").setExecutor(new ShareCommand());
        this.getCommand("create").setExecutor(new CreateCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("CocardosPlugin has been disabled!");
    }
}