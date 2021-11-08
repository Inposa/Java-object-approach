package com.github.inposa.jdr.src.entities.builders;

import com.github.inposa.jdr.src.entities.Entity;
import com.github.inposa.jdr.src.creatures.Troll;

public class TrollBuilder implements I_EntityBuilder {

    @Override
    public Entity buildEntity() {
        return new Troll();
    }
}
