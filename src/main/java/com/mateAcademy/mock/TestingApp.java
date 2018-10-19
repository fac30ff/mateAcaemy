package com.mateAcademy.mock;

import com.mateAcademy.Utils.GenerateAListOfProfessors;
import com.mateAcademy.Utils.GenerateListOfStudents;
import com.mateAcademy.Utils.SetGroup;
import com.mateAcademy.model.Group;
import com.mateAcademy.model.Lesson;
import com.mateAcademy.model.Professor;
import com.mateAcademy.model.Student;

import java.util.List;

public class TestingApp {

  private static List<Professor> professorList;
  private static List<Student> studentList;
  private static List<Group> groupList;

  public static void testRun(int numberOfProf, int numberOfStud) {
    professorList = new GenerateAListOfProfessors(numberOfProf).getProfessors();
    studentList = new GenerateListOfStudents(numberOfStud).getStudents();
    groupList = new SetGroup(studentList).getGroups();

    professorList.forEach(p -> p.setGroups(groupList));

    Lesson lesson = new Lesson(professorList.get(0), professorList.get(0).getGroups().get(0));
    lesson.setPresentOfStudents(lesson.getGroup());
    lesson.getProfessor().checkIfStudentPresent(lesson);
    lesson.getGroup().setHeadmanToGroup(lesson.getGroup().getStudents());
    System.out.println(lesson.getGroup().getHeadman());
  }
}
