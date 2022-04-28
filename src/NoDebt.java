public class NoDebt {
    private static int neededMoney = 0;
    private static int savedMoney = 0;
    private static int rent = 0;
    private static int food = 0;
    private static int drive = 0;
    private static int mobileInternet = 0;
    private static int drugs = 0;
    private static int regularExpense = 0;
    private static int salary = 0;
    private static int additionalIncome = 0;
    private static int childAmount = 0;

    static void enterData(int neededMoneyValue, int savedMoneyValue, int rentValue, int foodValue, int driveValue,
                          int mobileInternetValue, int drugsValue, int regularExpenseValue, int salaryValue,
                          int additionalIncomeValue, int childAmountValue) {
        neededMoney += neededMoneyValue;
        rent += rentValue;
        food += foodValue;
        drive += driveValue;
        mobileInternet += mobileInternetValue;
        drugs += drugsValue;
        regularExpense += regularExpenseValue;
        salary += salaryValue;
        additionalIncome += additionalIncomeValue;
        childAmount += childAmountValue;
        savedMoney += savedMoneyValue;
    }

    private static int compulsoryExpense() {
        return rent + food + drugs + drive + mobileInternet + regularExpense;
    }

    private static int getAliments() {
        return salary * 25 / 100 * childAmount;
    }

    public static int getBalance() {
        return salary + additionalIncome - savedMoney - compulsoryExpense() - getAliments();
    }

    public static String getNeededTime() {
        double neededTime = (double) neededMoney / getBalance();
        return String.format("%.2f", neededTime);
    }
}
