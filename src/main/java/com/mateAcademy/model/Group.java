package com.mateAcademy.model;

import java.util.List;

public class Group {
  private String name;
  private Student headman;
  private List<Professor> professors;
  private List<Student> students;

  public Group(String name, List<Student> students) {
    this.name = name;
    this.students = students;
  }

  public Group(String name, List<Professor> professors, List<Student> students) {
    this.name = name;
    this.professors = professors;
    this.students = students;
  }

  public Group(String name, Student headman, List<Professor> professors, List<Student> students) {
    this.name = name;
    this.headman = headman;
    this.professors = professors;
    this.students = students;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student getHeadman() {
    return headman;
  }

  public void setHeadman(Student headman) {
    this.headman = headman;
  }

  public List<Professor> getProfessors() {
    return professors;
  }

  public void setProfessors(List<Professor> professors) {
    this.professors = professors;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }
}
