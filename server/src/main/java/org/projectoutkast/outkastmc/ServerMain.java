package org.projectoutkast.outkastmc;

import org.bukkit.plugin.java.JavaPlugin;

public class ServerMain extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Server plugin loaded");
    }
}