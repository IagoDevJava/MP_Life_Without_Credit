/*
TODO:
 Сделать программу помогающую копить, вместо того, чтобы брать кредиты.
 Траты внесены только самые основные, в дальнейшем потребуется расширение.
 */

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        System.out.println("Здравствуйте. Вас приветствует программа\n \t\t\"No debt!\"\nКакая сумма Вам необходима?");
        Scanner scNeededMoney = new Scanner(System.in);
        int neededMoney = scNeededMoney.nextInt();
        System.out.println("Сколько денег Вы откладываете на \"черный день\"?");
        Scanner scSavedMoney = new Scanner(System.in);
        int savedMoney = scSavedMoney.nextInt();
        System.out.println("Укажите суммы обязательных трат:\n\tкварплата -");
        Scanner scRent = new Scanner(System.in);
        int rent = scRent.nextInt();
        System.out.println("\tпродукты питания -");
        Scanner scFood = new Scanner(System.in);
        int food = scFood.nextInt();
        System.out.println("\tпроезд -");
        Scanner scDrive = new Scanner(System.in);
        int drive = scDrive.nextInt();
        System.out.println("\tсвязь -");
        Scanner scMobileInternet = new Scanner(System.in);
        int mobileInternet = scMobileInternet.nextInt();
        System.out.println("\tаптека, если есть регулярная потребность -");
        Scanner scDrugs = new Scanner(System.in);
        int drugs = scDrugs.nextInt();
        System.out.println("Какова общая сумма регулярных трат, если они есть?");
        Scanner scRegularExpense = new Scanner(System.in);
        int regularExpense = scRegularExpense.nextInt();
        System.out.println("Какова сумма Вашей заработной платы?");
        Scanner scSalary = new Scanner(System.in);
        int salary = scSalary.nextInt();
        System.out.println("Какова сумма Вашего дополнительного дохода?");
        Scanner scAdditionalIncome = new Scanner(System.in);
        int additionalIncome = scAdditionalIncome.nextInt();
        System.out.println("Есть ли у Вас дети, сколько?");
        Scanner scChildAmount = new Scanner(System.in);
        int childAmount = scChildAmount.nextInt();
        NoDebt.enterData(neededMoney, savedMoney, rent, food, drive, mobileInternet, drugs, regularExpense,
                salary, additionalIncome, childAmount);

        System.out.println("\t\t-------------------");
        if (NoDebt.getBalance() <= 0) {
            System.out.println("К сожалению Вы не можете откладывать деньги.\nПожалуйста, задумайтесь о снижении расходов.");
        } else {
            System.out.println("Вы можете откладывать по " + NoDebt.getBalance() + " рублей в месяц и через "
                    + NoDebt.getNeededTime() + " месяцев Вы получите желаемое.");
        }
    }
}