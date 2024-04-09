package org.laurentc79.sandboxspringboot.api.rest;

import org.laurentc79.sandboxspringboot.api.model.mapper.CharacterResponseMapper;
import org.laurentc79.sandboxspringboot.api.model.mapper.CharacterMapper;
import org.laurentc79.sandboxspringboot.api.model.request.CharacterRequest;
import org.laurentc79.sandboxspringboot.api.model.response.CharacterResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enum")
public class EnumController {

    private final CharacterMapper characterMapper;
    private final CharacterResponseMapper characterResponseMapper;

    public EnumController(CharacterMapper characterMapper, CharacterResponseMapper characterResponseMapper) {
        this.characterMapper = characterMapper;
        this.characterResponseMapper = characterResponseMapper;
    }

    @PostMapping(path = "/test", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CharacterResponse getResponse(@RequestBody CharacterRequest characterRequest) {

        return characterResponseMapper.fromMyModel1(characterMapper.fromEnumRequest(characterRequest));
    }
}
