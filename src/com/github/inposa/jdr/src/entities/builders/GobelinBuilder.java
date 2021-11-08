package com.github.inposa.jdr.src.entities.builders;

import com.github.inposa.jdr.src.entities.Entity;
import com.github.inposa.jdr.src.creatures.Gobelin;

public class GobelinBuilder implements I_EntityBuilder {

    @Override
    public Entity buildEntity() {
        return new Gobelin();
    }
}
