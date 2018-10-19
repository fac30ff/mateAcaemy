package com.mateAcademy.model;

abstract class Person {

  private String name;
  private String lastName;
  private String fullName;

  Person(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
    this.fullName = name + " " + lastName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public String toString() {
    return "fullName='" + fullName + '\'';
  }
}
