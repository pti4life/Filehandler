package com.csaszarteam.fileuploader.service.domain;

import com.csaszarteam.fileuploader.database.entity.User;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class FileDTO {
    private Long id;

    private String fileName;

    private long fileSize;

    private String mimeType;

    private Long sender;

    private LocalDate modify;

    private User user;

}
