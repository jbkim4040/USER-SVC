package com.abacus.usersvc.part;

import java.util.ArrayList;
import java.util.List;

public class PartRepositoryOnMemory implements PartRepository{

    private static List<PartEntity> partEntityList = new ArrayList<>();

    @Override
    public PartEntity findById(String id) {
        return partEntityList.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(new PartEntity());
    }

    @Override
    public PartEntity save(PartEntity partEntity) {
        partEntityList.add(partEntity);

        return partEntity;
    }
}
