package com.kevinraupp.domain.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinraupp.domain.user.User;
import com.kevinraupp.domain.user.UserRoles;

public record UserResponseDTO(
        Long id,
        String name,

        @JsonProperty("is_active")
        boolean isActive,

        UserRoles role) {

    public UserResponseDTO(User user) {
        this(user.getId(), user.getName(), user.isActive(), user.getRole());
    }
}
