package com.abacus.usersvc.part;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_part_m")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PartEntity {
    @Id
    @Column(name = "part_id", nullable = false)
    private String id;

    @Column(name = "part_1", nullable = false)
    private String part1;

    @Column(name = "part_2", nullable = true)
    private String part2;

    @Column(name = "part_3", nullable = true)
    private String part3;

    @Column(name = "part_4", nullable = true)
    private String part4;

    @Column(name = "part_5", nullable = true)
    private String part5;
}
