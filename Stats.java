public class Stats {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Stats <numbers>");
            return;
        }

        long sum = 0;
        int min = Integer.parseInt(args[0]);
        int max = min;

        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            sum += number;

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        double average = (double) sum / args.length;

        System.out.println("Count: " + args.length);
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average: %.2f%n", average);
    }
}
