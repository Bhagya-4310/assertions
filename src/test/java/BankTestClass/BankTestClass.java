package BankTestClass;
import BankAccount.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


public class BankTestClass{
    @Test
    public void login(){
        Address add=new Address();
        add.area="kphb";
        add.city="hyd";
        add.flatNo="1234";
        add.pincode="123456";
        add.street="asdf";
        Eligibility eligibility=new Eligibility();
        eligibility.age=19;
        Service service=new Service();
      Account account=service.login(eligibility);
        System.out.println(service.login(eligibility));
        Assertions.assertEquals(5000,account.minimumBalance);
        assertNotNull(eligibility.age);
    }
    @Test
    public void loginUnsuccessful(){
        Address add=new Address();
        add.area="kphb";
        add.city="hyd";
        add.flatNo="1234";
        add.pincode="123456";
        add.street="asdf";
        Eligibility eligibility=new Eligibility();
        eligibility.age=17;
        Service service=new Service();
        Account account=service.login(eligibility);
        assertNull(account);
    }
}