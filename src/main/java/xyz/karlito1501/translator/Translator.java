package xyz.karlito1501.translator;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Translator extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(Colors.rainbowText("++++++++++++++++++++++++++++++++"));
        System.out.println(Colors.rainbowText("++++++++++++++++++++++++++++++++"));
        System.out.println(Colors.YELLOW + "Translator has been enabled!");
        System.out.println(Colors.rainbowText("++++++++++++++++++++++++++++++++"));
        System.out.println(Colors.rainbowText("++++++++++++++++++++++++++++++++"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
