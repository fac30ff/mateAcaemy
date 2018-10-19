package com.mateAcademy.Utils;

import com.mateAcademy.constant.Сharacteristic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public interface GeneralGenerator {

  default Map<Сharacteristic, Integer> generateCharacteristics() {
    Map<Сharacteristic, Integer> map = new HashMap<>();
    for (Сharacteristic сharacteristic : Сharacteristic.values()) {
      map.put(сharacteristic, getRandomInteger(0, 100));
    }
    return map;
  }

  default int getRandomInteger(int min, int max) {
    return ThreadLocalRandom.current().nextInt(min, max + 1);
  }
}
