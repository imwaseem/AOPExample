package com.example.endpoint;

import com.example.model.DummyModel;
import com.example.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

    @Autowired
    CustomService customService;

    @GetMapping("/getDummyModel")
    public DummyModel getDummyModel(){
        System.out.println("endpoint getDummyModel() execution test started");
        return customService.getDummyModel();
    }
}
