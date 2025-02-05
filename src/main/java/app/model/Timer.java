package app.model;


import org.springframework.stereotype.Component;

@Component
public class Timer {

    private static final Long nanoTime = System.nanoTime();

    public static Long getTime() {
        return nanoTime;
    }
}
