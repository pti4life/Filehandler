package com.csaszarteam.fileuploader.service.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import java.time.LocalDate;

@Getter
@Setter
@ToString
public class FileDTO {
    private Long id;

    private String fileName;

    private long fileSize;

    private String mimeType;

    private Long sender;

    private LocalDate modify;

}
