package admission;

public class Service {
    public Admission getAdmission(Student student) {
        Admission admission = null;
        if (student.age > 6) {
            admission = new Admission();
            admission.standard = "6thclass";
            admission.fee = 10000;
            admission.rollNo = "4310";
        } else {
            System.out.println("not eligible");
        }
        return admission;
    }
}