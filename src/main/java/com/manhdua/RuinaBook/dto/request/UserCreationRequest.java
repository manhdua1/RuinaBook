package com.manhdua.RuinaBook.dto.request;

import com.manhdua.RuinaBook.enums.Gender;
import com.manhdua.RuinaBook.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @NotBlank
    @Email
    String email;

    @NotBlank
    @Size(min = 8)
    String password;

    String fullName;
    LocalDate dob;
    Gender gender;
}
