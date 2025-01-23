package com.example.aiconfiggenerator.model;

import java.util.List;

public record GitlabCiCdConfig(
    List<Stage> stages
) {}
