public class DemoSwitchExpression {

    public static enum Color {
        RED, BLACK, YELLOW,;
    }

    public static void main(String[] args) {
        Color color = Color.RED;
        // traditional switch is void
        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
            case BLACK:
                System.out.println("Black");
                break;
        } // suitable for switch

        // Switch expression -> must return
        // 1. return somthing
        // 2. check if all possible enum value is handled
        // 3. No break, becuase it is for return value; less break less possible error
        String result = switch (color) {
            case RED -> "Red"; // looks like return
            case BLACK, YELLOW -> "Black or Yellow";
        };
        System.out.println(result);

        // yield
        String result2 = switch (color) {
            case RED -> {
                int x = 3;
                if (x >= 3) {
                    yield "Red.";
                } else {
                    yield "RED!!!";
                }
            }
            case BLACK, YELLOW -> "Black or Yellow";
        };
        System.out.println(result2);
    };
}
