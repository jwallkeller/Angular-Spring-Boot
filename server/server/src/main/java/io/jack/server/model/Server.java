package io.jack.server.model;

import io.jack.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;

/**
 * @author Jack Keller
 * @version 1.0
 * @since 10/16/2022 
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddres;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}