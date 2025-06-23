package org.scoula.Actor.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.Actor.dto.ActorDTO;
import org.scoula.Actor.service.ActorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/actor")
@RequiredArgsConstructor // 생성자 자동 생성해줌.
public class ActorController {

    private final ActorService service;

    @GetMapping("/get")
    public ResponseEntity<List<ActorDTO>> getActorList(@RequestParam(required = false)int releaseYear) {
        log.info("get actor list in " + releaseYear);
        List<ActorDTO> actorDTOList = service.getActorList(releaseYear);

        if (actorDTOList.isEmpty()) {
            log.info("출력 실패");
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(actorDTOList);
        }
    }
    // responseEntity 형태 반영

    /* http://localhost:8080/actor/get?releaseYear=2006 Get 요청 시 자료 확인 가능 */

}
