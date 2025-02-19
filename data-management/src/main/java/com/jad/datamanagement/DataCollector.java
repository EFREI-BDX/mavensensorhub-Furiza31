package com.jad.datamanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jad.common.ISensor;
import com.jad.common.SensorData;
import com.jad.common.SensorType;

class DataCollector {
    private final ISensor sensor;
    private final List<SensorData> collectedData = new ArrayList<>();

    public DataCollector(final ISensor sensor) {
        this.sensor = sensor;
    }

    public final SensorType getSensorType() {
        return this.sensor.getSensorType();
    }

    public final void collectData() {
        this.collectedData.add(this.sensor.getSensorData());
    }

    public final List<SensorData> getAllCollectedData() {
        return Collections.unmodifiableList(this.collectedData);
    }

    public final void clearCollectedData() {
        this.collectedData.clear();
    }
}
