package com.csaszarteam.fileuploader.database.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="files")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class File {
    @Id
    @GeneratedValue
    private Long id;

    private String fileName;

    private long fileSize;

    private String mimeType;

    @Column(name = "sender_id",nullable = true)
    private Long sender;

    @ManyToOne
    private User user;

    private LocalDate modify;
}
