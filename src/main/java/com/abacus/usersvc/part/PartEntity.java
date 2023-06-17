package com.abacus.usersvc.part;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PartEntity {
    @Id
    @Column(name = "part_id")
    private String id;

    @Nonnull
    @Column(name = "part_1")
    private String part1;

    @Nullable
    @Column(name = "part_2")
    private String part2;


    @Nullable
    @Column(name = "part_3")
    private String part3;


    @Nullable
    @Column(name = "part_4")
    private String part4;


    @Nullable
    @Column(name = "part_5")
    private String part5;
}
