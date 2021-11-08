package com.github.inposa.jdr.src.entities.builders;

import com.github.inposa.jdr.src.entities.Entity;
import com.github.inposa.jdr.src.entities.Player;

public class PlayerBuilder implements I_EntityBuilder {

    @Override
    public Entity buildEntity() {
        return new Player();
    }
}
