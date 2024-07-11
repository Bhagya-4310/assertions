package BankAccount;

import java.util.Date;
import java.util.UUID;

public class Account {
    public UUID accountNumber;

    public String accountHolderName;
    public Address address;
    public Date dob;
    public int minimumBalance;


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", address=" + address +
                ", dob=" + dob +
                ", minimumBalance=" + minimumBalance +
                '}';
    }
}