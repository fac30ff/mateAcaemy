package com.mateAcademy.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
  private String name;
  private Student headman;
  private List<Student> students;

  public Group(String name, List<Student> students) {
    this.name = name;
    this.students = students;
  }


  public Group(String name, Student headman, List<Student> students) {
    this.name = name;
    this.headman = headman;
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

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public void setHeadmanToGroup(final List<Student> students) {
    int counter = 0;
    Map<String, Integer> tempMap = new HashMap<>();
    tempMap.forEach(
        students
        .stream()
        .forEach(e -> {
          if (!e.getFullName().equals(tempMap.get(e.getFullName()))) {
            tempMap.put(e.getFullName(), counter);
          }
        });
        tempMap.clear();
    )
  }
}
