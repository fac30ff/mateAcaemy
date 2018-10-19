package com.mateAcademy.Utils;

import com.mateAcademy.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class GenerateAListOfProfessors implements GeneralGenerator {

  List<Professor> professors = new ArrayList<>();
  private GeneratorOfNamesOrLastname generatorOfNamesOrLastname = new GeneratorOfNamesOrLastname();

  public GenerateAListOfProfessors(int number) {
    this.addProffessorsToList(number);
  }

  public List<Professor> getProfessors() {
    return professors;
  }

  private void addProffessorsToList(int number) {
    for (int i = 0; i < number; i++) {
      this.professors.add(new Professor(generatorOfNamesOrLastname.generatorOfFullname(i),
          generatorOfNamesOrLastname.generatorOfFullname(number - i)));
    }
  }


}
