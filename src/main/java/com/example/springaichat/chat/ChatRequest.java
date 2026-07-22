package com.example.springaichat.chat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ChatRequest(
        @NotBlank(message = "Message must not be blank")
        @Size(max = 10_000, message = "Message must contain at most 10000 characters")
        String message) {
}
