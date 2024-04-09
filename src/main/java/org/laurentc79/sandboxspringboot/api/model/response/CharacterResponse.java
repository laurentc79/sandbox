package org.laurentc79.sandboxspringboot.api.model.response;

import lombok.Builder;
import lombok.Data;
import org.laurentc79.sandboxspringboot.model.entity.CharacterType;


@Data
@Builder
public class CharacterResponse {
    private String uuid;
    private String displayName;
    private CharacterType type;
}
