package BankAccount;

import java.util.Date;
import java.util.UUID;

public class Service{
  //  public boolean login(Account account) {
       /* String firstName = "bhagi";
        String lastName = "akkiraju";
        String adharNo = "4310";
        if (account.firstName.equals(firstName) && account.lastName.equals(lastName) && account.adharNo.equals(adharNo)) {
            System.out.println("login");
return false; */
    public Account login(Eligibility eligibility){
        Account account=null;
        if(eligibility.age>18){
            account=new Account();
            account.accountNumber=UUID.randomUUID();
            account.accountHolderName="bhagi";
            account.minimumBalance=5000;
            account.dob=new Date();
          //  account.address=add;
        }
        else{
            System.out.println("age is insufficient");
        }
return  account;
    }
}