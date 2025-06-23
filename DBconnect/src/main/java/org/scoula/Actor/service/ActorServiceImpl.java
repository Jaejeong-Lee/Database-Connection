package org.scoula.Actor.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.Actor.dto.ActorDTO;
import org.scoula.Actor.mapper.ActorMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {

    private final ActorMapper mapper;

    @Override
    public List<ActorDTO> getActorList(int releaseYear) {
        return mapper.getActorList(releaseYear).stream()
                .map(ActorDTO::of)
                .toList();

    }
}
