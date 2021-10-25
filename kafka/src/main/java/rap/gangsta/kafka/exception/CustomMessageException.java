package rap.gangsta.kafka.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CustomMessageException extends RuntimeException {

    private final String message;

    public CustomMessageException(String message, Throwable cause) {
        this.message = message;
        initCause(cause);
    }
}
