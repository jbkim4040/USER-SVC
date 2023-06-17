package com.abacus.usersvc.part;

import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository {
    PartEntity findById(String id);

    PartEntity save(PartEntity partEntity);
}
