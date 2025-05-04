package com.goldbank.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;
import java.util.List;

@ConfigurationProperties(prefix = "accounts")
public record AccountContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
