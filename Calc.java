public class Calc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
            return;
        }

        String command = args[0];

        if (!command.equals("add") && !command.equals("mult")
                && !command.equals("max") && !command.equals("min")) {
            System.err.println("Unknown operation: " + command);
            return;
        }

        int result = Integer.parseInt(args[1]);

        if (command.equals("add")) {
            result = 0;
        } else if (command.equals("mult")) {
            result = 1;
        }

        for (int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);

            if (command.equals("add")) {
                result += number;
            } else if (command.equals("mult")) {
                result *= number;
            } else if (command.equals("max")) {
                if (number > result) {
                    result = number;
                }
            } else if (command.equals("min")) {
                if (number < result) {
                    result = number;
                }
            }
        }

        System.out.println(result);
    }
}
