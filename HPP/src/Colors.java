package HPP;

public class Colors {
    // Reset para limpar estilos e cores
    public static final String RESET = "\u001B[0m";

    // Cores de texto (foreground)
    public static final String BLACK_TEXT = "\u001B[30m";
    public static final String RED_TEXT = "\u001B[31m";
    public static final String GREEN_TEXT = "\u001B[32m";
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String BLUE_TEXT = "\u001B[34m";
    public static final String PURPLE_TEXT = "\u001B[35m";
    public static final String CYAN_TEXT = "\u001B[36m";
    public static final String WHITE_TEXT = "\u001B[37m";

    // Cores de fundo (background)
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";

    // Arrays contendo todas as cores de texto
    public static final String[] ALL_TEXT_COLORS = {
        BLACK_TEXT, RED_TEXT, GREEN_TEXT, YELLOW_TEXT,
        BLUE_TEXT, PURPLE_TEXT, CYAN_TEXT, WHITE_TEXT
    };

    // Arrays contendo todas as cores de fundo
    public static final String[] ALL_BACKGROUND_COLORS = {
        BLACK_BACKGROUND, RED_BACKGROUND, GREEN_BACKGROUND, YELLOW_BACKGROUND,
        BLUE_BACKGROUND, PURPLE_BACKGROUND, CYAN_BACKGROUND, WHITE_BACKGROUND
    };
}
