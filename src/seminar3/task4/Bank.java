package seminar3.task4;

import java.util.HashSet;

public class Bank {
    HashSet<Account> accounts = new HashSet<>();
    void addAccount(Account account){
        this.accounts.add(account);
    }

//    public HashSet<Account> getAccounts() {
//        return accounts;
//    }


}
