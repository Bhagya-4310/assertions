package admission;

public class Student {
   public String name;
  public   byte age;
  public   Address address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
