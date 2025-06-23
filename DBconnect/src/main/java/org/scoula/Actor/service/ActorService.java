package org.scoula.Actor.service;

import org.scoula.Actor.dto.ActorDTO;
import java.util.List;

public interface ActorService {

    List<ActorDTO> getActorList(int releaseYear);
}
