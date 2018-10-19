package com.mateAcademy.model;

import com.mateAcademy.constant.Сharacteristic;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Student extends Person implements Voteable{

  private Map<Сharacteristic, Integer> characteristics;

  public Student(String name, String lastName) {
    super(name, lastName);
  }

  public Student(String name, String lastName, Map<Сharacteristic, Integer> characteristics) {
    super(name, lastName);
    this.characteristics = characteristics;
  }

  public Map<Сharacteristic, Integer> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(Map<Сharacteristic, Integer> characteristics) {
    this.characteristics = characteristics;
  }

  @Override
  public Student voteForHeadmanOfGroup(final List<Student> students) {
    return students.stream().min(Comparator.comparingDouble(s -> getAverageCharacteristics(s.getCharacteristics())))
        .get();
  }

  private Double getAverageCharacteristics(final Map<Сharacteristic, Integer> characteristics) {
    return characteristics.values().stream().mapToDouble(Number::doubleValue).average().getAsDouble();
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
