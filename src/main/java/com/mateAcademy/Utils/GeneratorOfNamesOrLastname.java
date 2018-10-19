package com.mateAcademy.Utils;

import java.security.SecureRandom;

public class GeneratorOfNamesOrLastname {

  private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  private static final String lower = upper.toLowerCase();

  private static final String nameOrSurname = upper + lower;

  private static SecureRandom sr = new SecureRandom();

  public static String generatorOfFullname(int length) {
    StringBuilder sb = new StringBuilder(length);
    for( int i = 0; i < length; i++ ) {
      sb.append( nameOrSurname.charAt(sr.nextInt(nameOrSurname.length())));
    }
    return sb.toString();
  }
}
