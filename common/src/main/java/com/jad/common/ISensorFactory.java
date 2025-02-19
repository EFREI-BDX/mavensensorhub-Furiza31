package com.jad.common;

public interface ISensorFactory {
    ISensor make(SensorType sensorType);
}
