package com.pluginforge.spicyop;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpicyOpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SpicyOp v1.0 enabled.");
        getCommand("spicyop").setExecutor(new SpicyopCommand());
        getCommand("spicyop").setExecutor(new SpicyopCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("SpicyOp disabled.");
    }
}
