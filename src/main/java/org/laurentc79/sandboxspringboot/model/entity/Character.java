package org.laurentc79.sandboxspringboot.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Character {
    private String uuid;
    private String displayName;
    private CharacterType type;
}
