package org.scoula.Actor.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.Actor.domain.ActorVO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActorDTO {


    private String movieTitle;
    private String actorName;
//    private String actorFirstName;
//    private String actorLastName;
    private int releaseYear;
    private int movieId;
    private int actorId;


    public static ActorDTO of(ActorVO vo) {
        return vo == null ? null : ActorDTO.builder()
                .releaseYear(vo.getReleaseYear())
                .movieTitle(vo.getMovieTitle())
//                .actorFirstName(vo.getActorFirstName())
//                .actorLastName(vo.getActorLastName())
//                .actorName(vo.getActorFirstName() + ' ' + vo.getActorLastName())
                .actorName(vo.getActorName())
                .movieId(vo.getMovieId())
                .actorId(vo.getActorId())
                .build();
    }
}
