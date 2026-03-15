package com.manhdua.RuinaBook.entity;

import com.manhdua.RuinaBook.enums.Gender;
import com.manhdua.RuinaBook.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @Column(nullable = false, unique = true)
    String email;

    @Column(nullable = false)
    String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Role role;

    @Column(nullable = false)
    boolean isActive;

    String fullName;
    LocalDate dob;

    @Enumerated(EnumType.STRING)
    Gender gender;

    String avatarUrl;

    @CreationTimestamp
    LocalDateTime createdAt;

    @UpdateTimestamp
    LocalDateTime updatedAt;

}
