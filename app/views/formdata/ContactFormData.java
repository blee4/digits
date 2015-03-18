package views.formdata;

import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * The backing class for the Contact form.
 */
public class ContactFormData {
  /** The first name. */
  public String firstName;
  /** The last name. */
  public String lastName;
  /** The telephone number in xxx-xxx-xxxx format. */
  public String telephone;

  /**
   * Validate that all fields are non-empty and that telephone field has 12 characters.
   * @return Null if no errors, list of ValidationError otherwise.
   */
  public List<ValidationError> validate() {
    List<ValidationError> errors = new ArrayList<>();
    if ((firstName == null) || (firstName.length() == 0)) {
      errors.add(new ValidationError("firstName", "First name is required."));
    }
    if ((lastName == null) || (lastName.length() == 0)) {
      errors.add(new ValidationError("lastName", "Last name is required."));
    }
    if ((telephone == null) || (telephone.length() == 0)) {
      errors.add(new ValidationError("telephone", "Telephone is required."));
    }
    if ((telephone != null) && (telephone.length() != 12)) {
      errors.add(new ValidationError("telephone", "Telephone must have format xxx-xxx-xxxx"));
    }

    return errors.isEmpty() ? null : errors;
  }
}