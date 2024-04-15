import java.util.Scanner; //24. Написати програму для обчислення складних банківських відсотків по депозиту.

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Будь ласка, введіть всі обов'язкові аргументи: principal, rate, time");
            Scanner scanner = new Scanner(System.in);
            double principal = scanner.nextDouble();
            double rate = scanner.nextDouble();
            int time = scanner.nextInt();
            double compoundInterest = calculateInterest(principal, rate, time);
            System.out.printf("Складні відсотки за %d роки: %.2f грн%n", time, compoundInterest);
        } else {
            double principal = Double.parseDouble(args[0]);
            double rate = Double.parseDouble(args[1]);
            int time = Integer.parseInt(args[2]);
            double compoundInterest = calculateInterest(principal, rate, time);
            System.out.printf("Складні відсотки за %d роки: %.2f грн%n", time, compoundInterest);
        }
    }

    private static double calculateInterest(double principal, double rate, int time) {
        return principal * Math.pow(1.0 + rate / 100.0, time) - principal;
    }
}
//перший рядок (початкова сума), ставка, строки в роках.