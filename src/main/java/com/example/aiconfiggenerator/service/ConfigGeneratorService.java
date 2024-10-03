package com.example.aiconfiggenerator.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class ConfigGeneratorService {

    private final ChatClient chatClient;

    public ConfigGeneratorService(
            ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }


    @Value("classpath:/promptTemplates/simpleSystemPromptTemplate.st")
    private Resource promptTemplate;

    public String generateChartConfig(String prompt) {
        ChatResponse response = chatClient.prompt()
                .system(systemSpec -> systemSpec
                        .text(promptTemplate)
                        .param("configType", "Helm Chart")
                )
                .user(prompt)
                .call()
                .chatResponse();

        return response.getResult().getOutput().getContent();
    }

    public String generateGitlabCiCdConfig(String prompt) {
        ChatResponse response = chatClient.prompt()
                .system(systemSpec -> systemSpec
                        .text(promptTemplate)
                        .param("configType", "Gitlab CI/CD")
                )
                .user(prompt)
                .call()
                .chatResponse();

        return response.getResult().getOutput().getContent();
    }

}
