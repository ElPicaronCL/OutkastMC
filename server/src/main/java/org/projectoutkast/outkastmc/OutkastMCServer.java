package org.projectoutkast.outkastmc;

import org.bukkit.plugin.java.JavaPlugin;

public class OutkastMCServer extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Server plugin loaded");
    }
}