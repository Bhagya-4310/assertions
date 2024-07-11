package admission;
public class Address {
   public String flatNo;
  public   String street;
  public   String area;
  public   String city;
   public String pincode;
    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}