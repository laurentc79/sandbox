package org.laurentc79.sandboxspringboot.api.model.mapper;

import org.laurentc79.sandboxspringboot.api.model.request.CharacterRequest;
import org.laurentc79.sandboxspringboot.model.entity.Character;
import org.laurentc79.sandboxspringboot.model.entity.CharacterType;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CharacterMapper {

    public Character fromEnumRequest(CharacterRequest characterRequest) {
        return Character.builder()
                .uuid(UUID.randomUUID().toString())
                .displayName(characterRequest.getFirstname()+" "+characterRequest.getLastname().toUpperCase())
                .type(CharacterType.valueOf(characterRequest.getType().getType()))
                .build();
    }
}
