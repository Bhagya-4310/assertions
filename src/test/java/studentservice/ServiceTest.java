package studentservice;

import admission.Address;
import admission.Admission;
import admission.Service;
import admission.Student;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class ServiceTest {

            @Test
            public void test() {
                    Address add = new Address();
                    add.flatNo = "4310";
                    add.area = "kphb";
                    add.city = "hyd";
                    add.pincode = "1234";
                    add.street = "kukatpally";
                    Student student = new Student();
                    student.name = "bhagi";
                    student.age = 11;
                    student.address = add;
                    Service service = new Service();
                   // System.out.println(service.getAdmission(student));
                    Admission admission= service.getAdmission(student);
                    assertEquals(10000,admission.fee);
                    assertNotNull(admission.rollNo);
            }
    @Test
    public void testone() {
            Address add = new Address();
            add.flatNo = "4310";
            add.area = "kphb";
            add.city = "hyd";
            add.pincode = "1234";
            add.street = "kukatpally";
            Student student = new Student();
            student.name = "bhagi";
            student.age = 1;
            student.address = add;
            Service service = new Service();
          //  System.out.println(service.getAdmission(student));
            Admission admission= service.getAdmission(student);
            assertNull(admission);
    }
    }