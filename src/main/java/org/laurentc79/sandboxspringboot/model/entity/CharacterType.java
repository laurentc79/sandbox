package org.laurentc79.sandboxspringboot.model.entity;

import lombok.Getter;

@Getter
public enum CharacterType {
    PLAYER("PLAYER"),
    GAME_MASTER("GAME_MASTER"),
    NON_PLAYER_CHARACTER("NON_PLAYER_CHARACTER");

    private final String type;

    CharacterType(String type) {
        this.type = type;
    }
}
