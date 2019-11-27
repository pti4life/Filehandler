package com.csaszarteam.fileuploader.service.domain;

import com.csaszarteam.fileuploader.database.entity.User;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
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
