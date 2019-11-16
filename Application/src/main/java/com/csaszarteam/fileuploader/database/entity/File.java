package com.csaszarteam.fileuploader.database.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="files")
public class File {
    @Id
    @GeneratedValue
    private Long id;

    private String fileName;

    private long fileSize;

    private String mimeType;

    @JoinColumn(name ="sender_id")
    private long senderID;

    @ManyToOne
    private User user;

}
