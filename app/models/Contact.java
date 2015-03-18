package models;

/**
 * Mockup model for the backend database.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String telephone;
  private String address;
  private long id;

  /**
   * Creates a contact instance.
   * @param firstName The first name.
   * @param lastName The last name.
   * @param telephone The telephone.
   * @param address The address.
   * @param id The id.
   */
  public Contact(String firstName, String lastName, String telephone, String address, long id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.address = address;
    this.id = id;
  }

  /**
   * Returns first name.
   * @return The first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns last name.
   * @return The last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns telephone.
   * @return The telephone number.
   */
  public String getTelephone() {
    return telephone;
  }

  /**
   * Returns address.
   * @return The address.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Returns id.
   * @return The id.
   */
  public long getId() {
    return id;
  }
}
