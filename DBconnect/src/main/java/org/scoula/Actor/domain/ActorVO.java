package org.scoula.Actor.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActorVO {


    private String movieTitle;
    private String actorName;
//    private String actorFirstName;
//    private String actorLastName;
    private int releaseYear;
    private int movieId;
    private int actorId;

}
