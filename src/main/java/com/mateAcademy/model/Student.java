package com.mateAcademy.model;

import com.mateAcademy.constant.Сharacteristic;

import java.util.Map;

public class Student extends Person implements Voteable{

  private Map<Сharacteristic, Integer> characteristics;
  private boolean isHeadman;

  Student(String name, String lastName) {
    super(name, lastName);
    this.isHeadman = false;
  }

  Student(String name, String lastName, Map<Сharacteristic, Integer> characteristics) {
    super(name, lastName);
    this.characteristics = characteristics;
    this.isHeadman = false;
  }

  public Map<Сharacteristic, Integer> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(Map<Сharacteristic, Integer> characteristics) {
    this.characteristics = characteristics;
  }

  public boolean isHeadman() {
    return isHeadman;
  }

  public void setHeadman(boolean headman) {
    isHeadman = headman;
  }


  @Override
  public void voteForHeadmanOfGroup() {

  }

  @Override
  public String toString() {
    return super.toString() +
        ", isHeadman=" + isHeadman;
  }
}
