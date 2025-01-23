package com.example.aiconfiggenerator.model;

public record GitlabCiCdRequest(
        String prompt,
        GitlabCiCdConfig gitlabCiCdConfig
) {}
