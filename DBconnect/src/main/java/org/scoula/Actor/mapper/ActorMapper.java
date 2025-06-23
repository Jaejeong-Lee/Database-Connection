package org.scoula.Actor.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scoula.Actor.domain.ActorVO;
import org.scoula.Actor.dto.ActorDTO;

import java.util.List;

@Mapper
public interface ActorMapper {

    public List<ActorVO> getActorList(int releaseYear);

}
