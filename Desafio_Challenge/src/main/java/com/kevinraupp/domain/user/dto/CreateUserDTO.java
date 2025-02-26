package com.kevinraupp.domain.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateUserDTO(
        Long id,
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String password) {

}
