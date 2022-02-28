package academy.devdojo.springboot2.util;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//@Repository//trabalha diretamente com algumas exceções do springData
@Component
public class DateUtil {
    public String formatLocalDateTimeToDataBaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
