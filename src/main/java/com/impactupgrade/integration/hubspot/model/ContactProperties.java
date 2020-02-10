package com.impactupgrade.integration.hubspot.model;

public class ContactProperties implements AbstractModel {

  private HasValue<String> firstname;
  private HasValue<String> lastname;
  private HasValue<String> email;

  public HasValue<String> getFirstname() {
    return firstname;
  }

  public void setFirstname(HasValue<String> firstname) {
    this.firstname = firstname;
  }

  public HasValue<String> getLastname() {
    return lastname;
  }

  public void setLastname(HasValue<String> lastname) {
    this.lastname = lastname;
  }

  public HasValue<String> getEmail() {
    return email;
  }

  public void setEmail(HasValue<String> email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "ContactProperties{" +
        "firstname=" + firstname +
        ", lastname=" + lastname +
        ", email=" + email +
        '}';
  }
}
