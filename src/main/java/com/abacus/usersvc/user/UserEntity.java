package com.abacus.usersvc.user;

import com.abacus.usersvc.part.PartEntity;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserEntity {

    @Id
    @Column(name = "user_id")
    private String id;

    @Nonnull
    @Column(name = "user_passwork")
    private String password;

    @Nonnull
    @Column(name = "user_name")
    private String name;

    @Nonnull
    @Column(name = "user_rank")
    private String rank;

    @OneToOne
    @Column(name = "user_part")
    private PartEntity part;

    @Nonnull
    @Column(name = "user_phone")
    private String phone;

    @Nonnull
    @Column(name = "user_email")
    private String email;

    @Nonnull
    @Enumerated(EnumType.STRING)
    @Column(name = "user_authority")
    private Authority authority;
}
