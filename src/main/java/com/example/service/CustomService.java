package com.example.service;

import com.example.aspect.LogService;
import com.example.model.DummyModel;
import com.example.model.LogInfo;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

    public DummyModel getDummyModel(){
        System.out.println("getDummyModel() service execution started");
        log();
        return new DummyModel("Waseem Nasir","3214");
    }

    @LogService
    private LogInfo log(){
        System.out.println("executing log method");
        LogInfo logInfos = new LogInfo();
        logInfos.setBuName("AL Rehmat");
        logInfos.setContentName("Testing");
        System.out.println("executing log method end");
        return logInfos;
    }
}
