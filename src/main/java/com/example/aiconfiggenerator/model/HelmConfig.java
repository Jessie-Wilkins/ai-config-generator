package com.example.aiconfiggenerator.model;

public record HelmConfig(
    String kubernetesService,
    String deployment,
    String ingress,
    String serviceMonitor,
    String prometheusRule,
    String configMap,
    String secret,
    String ingressRoute,
    String certificate,
    String ingressRouteTLS
) {}
