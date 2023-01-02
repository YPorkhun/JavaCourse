package HomeWork1;

public class BankAccountClass {

    private double balance; // баланс
    private int accountNumber = 0; // ID аккаунт

//    public BankAccountClass(double balance, int accountNumber) {
//        this.balance = balance;
//        this.accountNumber = accountNumber;
//    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void credit(double sumAdd) {
        if (sumAdd < 0) {
            System.out.println("Сумма не может быть отрицательной!");
        } else balance += sumAdd;
    }

    public void debit(double sumRemove) {
        if (sumRemove < 0) {
            System.out.println("Сумма не может быть отрицательной!");
        } else if (balance < sumRemove) {
            System.out.println("Сумма снятия больше чем остаток на счету!");
        } else balance -= sumRemove;
    }

    public static void main(String[] args) {
//      BankAccountClass acc = new BankAccountClass(124455.89, 1);
//        System.out.println("Текущая сумма на счету: " + acc.getBalance() + " $");
    }
}
