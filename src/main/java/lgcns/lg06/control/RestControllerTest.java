package lgcns.lg06.control;

import lgcns.lg06.domain.CurlResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

@RestController
@Log4j2
public class RestControllerTest {

    @GetMapping("/test")
    public ResponseEntity<CurlResponseDTO> test() {
        return ResponseEntity.ok(createWelcomeMessage());
    }

    public CurlResponseDTO createWelcomeMessage(){
        return CurlResponseDTO.builder()
//                .koreanTime(ZonedDateTime.now(ZoneId.of("Asia/Seoul")) + "[Asia/Seoul]")
                .koreanTime(ZonedDateTime.now(ZoneId.of("Asia/Seoul")))
                .timeStamp(System.currentTimeMillis())
                .message("Hello, World")
                .build();
    }
}
