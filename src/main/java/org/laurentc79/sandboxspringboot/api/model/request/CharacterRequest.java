package org.laurentc79.sandboxspringboot.api.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CharacterRequest {
    private String firstname;
    private String lastname;
    private CharacterRequestType type;
}
