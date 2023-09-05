package seminar3.task4;

import java.util.HashSet;

//Задача: Управление банковскими счетами
//
// Вы разрабатываете программу для управления банковскими счетами.
// Вам нужно реализовать классы для создания счетов, пополнения, снятия денег и вывода
// информации о балансе. Также нужно предусмотреть обработку различных исключительных ситуаций.
// Создание собственных исключений InsufficientFundsException и NegativeAmountException.
// Обработка исключений при работе с методами deposit и withdraw класса BankAccount.
public class Main {
    public static void main(String[] args) {
        Bank accounts = new Bank();
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        try {
            account1 = new Account(1l, 900);
            accounts.addAccount(account1);
            System.out.println(account1);
            account2 = new Account(2l, 1000);
            accounts.addAccount(account2);
            System.out.println(account2);
            account3 = new Account(3l, -5);
            accounts.addAccount(account3);
            System.out.println(account3);
        } catch (NegativeAmountException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            account1.deposit(-40);
            System.out.println(account1);
        } catch (NegativeAmountException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            account1.deposit(40);
            System.out.println(account1);
        } catch (NegativeAmountException exception){
            System.out.println(exception.getMessage());
        }
    }
}
