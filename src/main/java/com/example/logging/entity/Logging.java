package com.example.logging.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "logging")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Logging {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logger;

    private String level;

    private String message;

    private LocalDateTime createdDate;

    private String createdBy;

    private LocalDateTime modifiedDate;

    private LocalDateTime modifiedBy;

}
