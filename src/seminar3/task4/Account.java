package seminar3.task4;

public class Account {
    private long number;
    private int amountOnAccount;

    public Account() {
    }

    public Account (long number, int amount) throws NegativeAmountException {
        if (amount<0){
            throw new NegativeAmountException("Создать счёт с отрицательным балансом нельзя!");
        }
        this.number = number;
        this.amountOnAccount = amount;
    }

    public long getNumber() {
        return number;
    }

    public int getAmount() {
        return amountOnAccount;
    }
    public void withdraw(int amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount>amountOnAccount){
            throw new InsufficientFundsException("Ошибка! Недостаточно средств на Вашем счёте");
        } else if (amount < 0) {
            throw new NegativeAmountException("Вы ввели отрицательную сумму.");
        } else {
            this.amountOnAccount -= amount;
        }
    }

    public void deposit (int amount) throws NegativeAmountException {
        if (amount<0){
            throw new NegativeAmountException("Вы ввели отрицательную сумму.");
        }
        this.amountOnAccount+=amount;
    }
    @Override
    public String toString (){
        return String.format("%d - %d", number, amountOnAccount);
    }
}
