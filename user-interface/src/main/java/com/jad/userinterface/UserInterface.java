package com.jad.userinterface;

import java.util.List;

import com.jad.common.IApplication;
import com.jad.common.IUserInterface;
import com.jad.common.SensorData;

public class UserInterface implements IUserInterface {
    private final Dashboard dashboard;
    private final UserInteraction userInteraction;
    private final IApplication application;
    private boolean running = true;

    public UserInterface(final IApplication application) {
        this.dashboard = new Dashboard(application.getDataManager());
        this.application = application;
        this.userInteraction = new UserInteraction();
    }

    @Override
    public void stop() {
        this.running = false;
    }

    @Override
    public void start() {
        while (this.running) {
            this.application.manageOrder(this.userInteraction.getUserPrompt());
        }
    }

    @Override
    public void displayDashboard() {
        this.dashboard.display();
    }

    @Override
    public void displayHelp() {
        this.userInteraction.displayHelp();
    }

    @Override
    public void displayAllData(final List<SensorData> allData) {
        this.dashboard.displayAllData(allData);
    }
}
