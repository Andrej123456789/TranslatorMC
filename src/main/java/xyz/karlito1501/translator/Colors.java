package xyz.karlito1501.translator;

public class Colors {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static String rainbowText(String text) {
        String[] rainbowColors = {RED, YELLOW, GREEN, CYAN, BLUE, PURPLE};
        StringBuilder rainbowText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String color = rainbowColors[i % rainbowColors.length];
            rainbowText.append(color).append(c);
        }

        // Reset color to default
        rainbowText.append(RESET);
        return rainbowText.toString();
    }
}
