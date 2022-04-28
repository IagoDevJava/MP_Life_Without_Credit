import java.util.Scanner;

public class Loader {

    public static void printingOutput() {
        System.out.println("\t\t-------------------");
        if (NoDebt.getBalance() <= 0) {
            System.out.println("К сожалению Вы не можете откладывать деньги.\nПожалуйста, задумайтесь о снижении расходов.");
        } else {
            System.out.println("Вы можете откладывать по " + NoDebt.getBalance() + " рублей в месяц и через "
                    + NoDebt.getNeededTime() + " месяцев Вы получите желаемое.");
        }
    }

    public static void dataEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте. Вас приветствует программа\n \t\t\"No debt!\"\nКакая сумма Вам необходима?");
        int neededMoney = scanner.nextInt();
        System.out.println("Сколько денег Вы откладываете на \"черный день\"?");
        int savedMoney = scanner.nextInt();
        System.out.println("Укажите суммы обязательных трат:\n\tкварплата -");
        int rent = scanner.nextInt();
        System.out.println("\tпродукты питания -");
        int food = scanner.nextInt();
        System.out.println("\tпроезд -");
        int drive = scanner.nextInt();
        System.out.println("\tсвязь -");
        int mobileInternet = scanner.nextInt();
        System.out.println("\tаптека, если есть регулярная потребность -");
        int drugs = scanner.nextInt();
        System.out.println("Какова общая сумма регулярных трат, если они есть?");
        int regularExpense = scanner.nextInt();
        System.out.println("Какова сумма Вашей заработной платы?");
        int salary = scanner.nextInt();
        System.out.println("Какова сумма Вашего дополнительного дохода?");
        int additionalIncome = scanner.nextInt();
        System.out.println("Есть ли у Вас дети, сколько?");
        int childAmount = scanner.nextInt();
        NoDebt.enterData(neededMoney, savedMoney, rent, food, drive, mobileInternet, drugs, regularExpense,
                salary, additionalIncome, childAmount);
    }
}