package com.mateAcademy.model;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Lesson {
  private Professor professor;
  private Group group;
  private Map<String, Boolean> presentOfStudents;

  public Lesson(Professor professor, Group group) {
    this.professor = professor;
    this.group = group;
  }

  public Lesson(Professor professor, Group group, Map<String, Boolean> presentOfStudents) {
    this.professor = professor;
    this.group = group;
    this.presentOfStudents = presentOfStudents;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public Map<String, Boolean> getPresentOfStudents() {
    return presentOfStudents;
  }

  public void setPresentOfStudents(Group group) {
    this.presentOfStudents = group.getStudents()
        .stream()
        .collect(Collectors.toMap(Student::getFullName, s -> setRandomPresenceOfStudent()));
  }

  private boolean setRandomPresenceOfStudent() {
    Random r = new Random();
    return r.nextBoolean();
  }


}
