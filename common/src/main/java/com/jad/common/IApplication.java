package com.jad.common;

public interface IApplication {
    void manageOrder(UserAction userAction);

    IDataManager getDataManager();
}
