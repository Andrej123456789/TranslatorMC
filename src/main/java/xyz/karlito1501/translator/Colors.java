package xyz.karlito1501.translator;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Colors {
    private static final Plugin plugin = JavaPlugin.getProvidingPlugin(Translator.class);

    public static final ChatColor RESET = ChatColor.RESET;
    public static final ChatColor BLACK = ChatColor.BLACK;
    public static final ChatColor RED = ChatColor.RED;
    public static final ChatColor GREEN = ChatColor.GREEN;
    public static final ChatColor YELLOW = ChatColor.YELLOW;
    public static final ChatColor BLUE = ChatColor.BLUE;
    public static final ChatColor PURPLE = ChatColor.DARK_PURPLE;
    public static final ChatColor CYAN = ChatColor.AQUA;
    public static final ChatColor WHITE = ChatColor.WHITE;

    public static String rainbowText(String text) {
        ChatColor[] rainbowColors = {RED, YELLOW, GREEN, CYAN, BLUE, PURPLE};
        StringBuilder rainbowText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            ChatColor randomColor = rainbowColors[(int) (Math.random() * rainbowColors.length)];
            rainbowText.append(randomColor).append(text.charAt(i));
        }

        rainbowText.append(RESET);
        return rainbowText.toString();
    }
}
