package com.desingpattern.DesignPatternsBehavior.templateMethod;

import java.time.Instant;

public class File {
    private String name;
    private Instant createAt;

    public File() {

    }

    public Instant getCreateAt() {
        return createAt;
    }

    public String getName() {
        return name;
    }
}
