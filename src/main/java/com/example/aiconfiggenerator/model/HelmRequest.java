package com.example.aiconfiggenerator.model;

public record HelmRequest(
    String prompt,
    HelmConfig helmConfig
) {}
