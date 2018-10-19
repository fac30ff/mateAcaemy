package com.mateAcademy.model;

import java.util.List;

public class Professor extends Person implements Checkable{

  private List<Group> groups;

  Professor(String name, String lastName) {
    super(name, lastName);
  }

  public Professor(String name, String lastName, List<Group> groups) {
    super(name, lastName);
    this.groups = groups;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  @Override
  public void checkIfStudentPresent(final Lesson lesson) {
    lesson.getPresentOfStudents()
        .forEach((k,v) -> {
          if (v) {
            System.out.println(k + " is present");
          } else {
            System.out.println(k + " is absent");
          }
        });
  }

  @Override
  public String toString() {
    return super.toString() +
        ", groups=" + groups;
  }
}
