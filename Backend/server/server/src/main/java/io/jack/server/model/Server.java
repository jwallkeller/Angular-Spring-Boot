package io.jack.server.model;

import io.jack.server.enumeration.Status;

/**
 * @author Jack Keller
 * @version 1.0
 * @since 10/16/2022 
 */
public class Server {
    private Long id;
    private String ipAddres;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}