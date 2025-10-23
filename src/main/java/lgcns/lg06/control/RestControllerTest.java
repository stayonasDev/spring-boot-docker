package lgcns.lg06.control;

import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class RestControllerTest {

        @GetMapping("/hello")
        public Map<String, Object> sayHello(){

                return Map.of(
                                "message", "Hello, World!",
                                "timesptamp", System.currentTimeMillis(),
                                "koreatime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString()
                             );
        }
}
