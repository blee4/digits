package models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A mockup internal in-memory data structure for contacts.
 */
public class ContactDB {

  private static Map<Long, Contact> contacts = new HashMap<>();
  private static long currentId = 1;

  /**
   * Creates a Contact instance from form data and adds it to internal contacts DB.
   * If form ID was zero, create and ID for this new contact before saving. Otherwise update the pre-existing entry.
   * @param formData The form data.
   */
  public static void addContact(ContactFormData formData) {
    long idVal = (formData.id == 0) ? currentId++ : formData.id;
    Contact contact = new Contact(formData.firstName, formData.lastName, formData.telephone, formData.address, idVal);
    contacts.put(idVal, contact);
  }

  /**
   * Returns the contact associated with id, or throws a RunTimeException if not found.
   * @param id The id.
   * @return The contact.
   */
  public static Contact getContact(long id) {
    Contact contact = contacts.get(id);
    if (contact == null) {
      throw new RuntimeException("Could not find the contact with associated id.");
    }
    return contact;
  }

  /**
   * Returns the list of contacts.
   * @return The contact list.
   */
  public static List<Contact> getContacts() {
    return new ArrayList<>(contacts.values());
  }

  /**
   * Deletes contact from DB.
   * @param id The id.
   */
  public static void deleteContact(long id) {
    contacts.remove(id);
  }
}
