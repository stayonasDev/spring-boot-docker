package lgcns.lg06.domain;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class CurlResponseDTO {
    private ZonedDateTime koreanTime;
//    private String koreanTime;
    private long timeStamp;
    private String message;
}
