package jota.error;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Adrian on 09.12.2016.
 */
public class BaseException extends Exception {

    private static final long serialVersionUID = 5617085097507773343L;

    protected Collection<String> messages;

    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(String msg, Exception cause) {
        super(msg, cause);
    }

    public BaseException(Collection<String> messages) {
        this.messages = messages;
    }

    public BaseException(Collection<String> messages, Exception cause) {
        super(cause);
        this.messages = messages;
    }

    @Override
    public String getMessage() {
        return Arrays.toString(messages.toArray());
    }
}
