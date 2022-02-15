public class Clock {
    // constants: these are "unicode" characters that
    // each represent a color!
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    // emoji example (unicode)
    private final String GREEN_APPLE_EMOJI = "\uD83C\uDF4F";
    private final String TOP_LEFT_CORNER = "\u250C";
    private final String TOP_RIGHT_CORNER = "\u2510";
    private final String BOTTOM_LEFT_CORNER = "\u2514";
    private final String BOTTOM_RIGHT_CONRER = "\u2518";

    // instance variable
    private String name;
    public Clock(String name) { this.name = name; }

    public void animate2() throws InterruptedException {
        String[] symbols = {"-", "\\", "|", "/",};

        System.out.print(BROWN + TOP_LEFT_CORNER);
        Thread.sleep(500);

        System.out.println(BLUE + TOP_RIGHT_CORNER);
        Thread.sleep(500);

        System.out.print(PURPLE + BOTTOM_LEFT_CORNER);
        Thread.sleep(500);

        System.out.println(RED + BOTTOM_RIGHT_CONRER);
        Thread.sleep(500);

        int index = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print(BROWN + TOP_LEFT_CORNER + CYAN + "---");
            //Thread.sleep(500);

            System.out.println(BLUE + TOP_RIGHT_CORNER);
            //Thread.sleep(500);

            System.out.println("  " + BLUE_BRIGHT + symbols[index]);

            System.out.print(PURPLE + BOTTOM_LEFT_CORNER + WHITE + "---");
            //Thread.sleep(500);

            System.out.println(RED + BOTTOM_RIGHT_CONRER);
            Thread.sleep(500);
            index++;
            if (index == 4) {
                index = 0;
            }
        }
    }
}
