package io.jack.server.enumeration;

/**
 * @author Jack Keller
 * @version 1.0
 * @since 10/16/2022 
 */
 public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");
    
    private final String status;

    Status(Status status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
 }