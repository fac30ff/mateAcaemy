package com.mateAcademy.Utils;

import com.mateAcademy.model.Group;
import com.mateAcademy.model.Student;

import java.util.ArrayList;
import java.util.List;

public class SetGroup {

  private List<Student> students;
  private List<Group> groups;

  public SetGroup(List<Student> students) {
    this.students = students;
    setGroups(this.students);
  }

  private void setGroups(List<Student> students) {
    List<List<Student>> partsOfStudent = chopped(students, 10);
    List<Group> groups = new ArrayList<>();
    for (int i = 0; i < partsOfStudent.size(); i++) {
      groups.add(new Group("group"+i, partsOfStudent.get(i)));
    }
    this.groups = new ArrayList<>(groups);
  }

  public List<Group> getGroups() {
    return groups;
  }

  private <T> List<List<T>> chopped(List<T> list, final int L) {
    List<List<T>> parts = new ArrayList<>();
    final int N = list.size();
    for (int i = 0; i < N; i += L) {
      parts.add(new ArrayList<>(
          list.subList(i, Math.min(N, i + L)))
      );
    }
    return parts;
  }

}
