

public class Address{

    private String no;
    private String street;
    private String city;
    private String zip;
    private String country;


    public String getAsString(){

	return this.no + ',' + this.street + ',' + this.city + ',' + this.zip + ',' + this.country;
    }

}
