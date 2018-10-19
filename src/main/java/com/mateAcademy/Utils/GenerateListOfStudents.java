package com.mateAcademy.Utils;

import com.mateAcademy.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GenerateListOfStudents implements GeneralGenerator {

  private List<Student> students = new ArrayList<>();
  private GeneratorOfNamesOrLastname generatorOfNamesOrLastname = new GeneratorOfNamesOrLastname();


  public GenerateListOfStudents(int number) {
    this.addStudentsToList(number);
  }

  public List<Student> getStudents() {
    return students;
  }

  private void addStudentsToList(int number) {
    for (int i = 0; i < number; i++) {
      this.students.add(new Student(generatorOfNamesOrLastname.generatorOfFullname(i),
          generatorOfNamesOrLastname.generatorOfFullname(number - i), generateCharacteristics()
          ));
    }
  }

}
