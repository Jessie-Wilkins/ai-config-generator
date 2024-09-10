package com.example.aiconfiggenerator.controller;

import com.example.aiconfiggenerator.service.ConfigGeneratorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigGeneratorController {

    private final ConfigGeneratorService configGeneratorService;

    public ConfigGeneratorController(ConfigGeneratorService configGeneratorService) {
        this.configGeneratorService = configGeneratorService;
    }


    @PostMapping(path="/generateHelmChart", produces="application/json")
    public String generateHelmChart() {
        return configGeneratorService.generateChartConfig();
    }

}
