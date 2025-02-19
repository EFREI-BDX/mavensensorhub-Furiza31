package com.jad.reportgeneration;

import java.util.List;

import com.jad.common.IReportGenerator;
import com.jad.common.ReportType;
import com.jad.common.SensorData;

public class ReportGenerator implements IReportGenerator {
    @Override
    public void generate(final ReportType reportType, List<SensorData> data) {
        switch (reportType) {
            case TEXT -> new TextReportGenerator().generateReport(data);
            case CSV -> new CSVReportGenerator().generateReport(data);
        }
    }
}
