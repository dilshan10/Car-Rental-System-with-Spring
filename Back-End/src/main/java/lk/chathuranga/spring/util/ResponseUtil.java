package lk.chathuranga.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.NamedEntityGraph;

@AllArgsConstructor
@NamedEntityGraph
@Data
@ToString
public class ResponseUtil {
    String code;
    String message;
    String data;
}
