package org.laurentc79.sandboxspringboot.api.model.mapper;

import org.laurentc79.sandboxspringboot.api.model.response.CharacterResponse;
import org.laurentc79.sandboxspringboot.model.entity.Character;
import org.springframework.stereotype.Component;

@Component
public class CharacterResponseMapper {

    public CharacterResponse fromMyModel1(Character character) {
        return CharacterResponse.builder()
                .uuid(character.getUuid())
                .displayName(character.getDisplayName())
                .type(character.getType())
                .build();
    }
}
