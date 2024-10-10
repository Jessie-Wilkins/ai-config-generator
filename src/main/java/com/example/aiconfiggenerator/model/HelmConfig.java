package com.example.aiconfiggenerator.model;

public record HelmConfig(
    String serviceName,
    String serviceType,
    int servicePort,
    String deploymentName,
    int replicaCount,
    String containerImage,
    String ingressHost,
    String ingressPath,
    String configMapName,
    String secretName
) {}
