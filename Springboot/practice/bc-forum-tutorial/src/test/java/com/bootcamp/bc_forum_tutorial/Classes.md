# User

private Long id; _PK_
String name;
String username;
String email;
String phone;
String website;

### @OneToOne
CompanyDTO company;

### @OneToOne
AddressDTO address;

# AddressDTO {

street;
suite;
city;
zipcode;


private GeoDTO geo;



GeoDTO             
lat;
lng

    // One to One
    @Getter
    @ToString
    public class CompanyDTO {
        name;
        catchPhrase;
        bs;
