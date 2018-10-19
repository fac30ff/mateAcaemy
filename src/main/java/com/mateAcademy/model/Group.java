package com.mateAcademy.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    this.headman = Collections.max(students.stream().map(s -> s.voteForHeadmanOfGroup(students))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet(), Comparator.comparingLong(Map.Entry::getValue)).getKey();
  }
}
