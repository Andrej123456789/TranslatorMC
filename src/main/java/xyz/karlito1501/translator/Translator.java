package xyz.karlito1501.translator;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Translator extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(Colors.rainbowText("++++++++++++++++++++++++++++++++"));
        getServer().getConsoleSender().sendMessage(Colors.rainbowText("++++++++++++++++++++++++++++++++"));
        getServer().getConsoleSender().sendMessage(Colors.YELLOW + "Translator has been enabled!");
        getServer().getConsoleSender().sendMessage(Colors.rainbowText("++++++++++++++++++++++++++++++++"));
        getServer().getConsoleSender().sendMessage(Colors.rainbowText("++++++++++++++++++++++++++++++++"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
