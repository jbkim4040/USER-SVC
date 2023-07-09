package com.abacus.usersvc.user;

import com.abacus.common.audit.Audit;
import com.abacus.usersvc.part.PartEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_user_m")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserEntity extends Audit {

    @Id
    @Column(name = "user_id", nullable = false)
    private String id;

    @Column(name = "user_passwork", nullable = false)
    private String password;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "user_rank", nullable = false)
    private String rank;

    @Column(name = "user_phone", nullable = false)
    private String phone;

    @Column(name = "user_email", nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_authority", nullable = false)
    private Authority authority;
}
