package com.jad.sensordata;

import com.jad.common.ISensor;
import com.jad.common.ISensorFactory;
import com.jad.common.SensorType;

public class SensorFactory implements ISensorFactory {
    @Override
    public ISensor make(SensorType sensorType) {
        return switch (sensorType) {
            case TEMPERATURE -> new TemperatureSensor();
            case HUMIDITY -> new HumiditySensor();
            case PRESSURE -> new PressureSensor();
            case WIND_SPEED -> new WindSpeedSensor();
        };
    }
}
