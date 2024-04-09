package org.laurentc79.sandboxspringboot.api.model.request;

import lombok.Getter;

@Getter
public enum CharacterRequestType {
    PLAYER("PLAYER"),
    GAME_MASTER("GAME_MASTER"),
    NON_PLAYER_CHARACTER("NON_PLAYER_CHARACTER");

    private final String type;

    CharacterRequestType(String type) {
        this.type = type;
    }
}
