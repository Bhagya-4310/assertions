package admission;
public class Admission {
    public String rollNo;
   public double fee;
   public  String standard;

    @Override
    public String toString() {
        return "Admission{" +
                "rollNo='" + rollNo + '\'' +
                ", fee=" + fee +
                ", standard='" + standard + '\'' +
                '}';
    }
}