package form;

public class Form {
  private String firstName;
  private String lastName;
  private Address address;

  // constructor, getter, setter
  public Form(String firstName, String lastName, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String toString() {
    return "Form(" //
        + "firstName=" + this.firstName //
        + ", lastName=" + this.lastName //
        + ", address=" + this.address // call this.address.toString()
        + ")";
  }

}
