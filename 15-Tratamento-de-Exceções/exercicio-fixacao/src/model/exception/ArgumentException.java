package model.exception;

import java.io.Serial;

public class ArgumentException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ArgumentException(String message) {
        super(message);
    }
}
