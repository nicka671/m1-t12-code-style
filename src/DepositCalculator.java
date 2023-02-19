import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);

        return roundToTwoDecimalPlaces(pay, 2);
    }

    double calculateSimplePercent(double doubledepositAmount, double doubleYearRate, int depositdepositPeriod) {
        return roundToTwoDecimalPlaces(doubledepositAmount + doubledepositAmount * doubleYearRate * depositdepositPeriod, 2);
    }

    double roundToTwoDecimalPlaces(double unroundedValue, int numberOfDecimalPlaces) {
        double scale = Math.pow(10, numberOfDecimalPlaces);
        return Math.round(unroundedValue * scale) / scale;
    }

    void countTotalDepositdepositAmount() {
        int depositPeriod;
        int depositAction;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");

        int depositAmount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");

        depositPeriod = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");

        depositAction = scanner.nextInt();
        double totalDepositAmount = 0;

        if (depositAction == 1) {
            totalDepositAmount = calculateSimplePercent(depositAmount, 0.06, depositPeriod);
        }
        else if (depositAction == 2) {
            totalDepositAmount = calculateComplexPercent(depositAmount, 0.06, depositPeriod);
        }
        System.out.println("Результат вклада: " + depositAmount + " за " + depositPeriod + " лет превратятся в " + totalDepositAmount);
    }

    public static void main(String[] args) {
        new DepositCalculator().countTotalDepositdepositAmount();
    }

}
