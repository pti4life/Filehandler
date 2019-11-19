package com.csaszarteam.fileuploader.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class FileDTO {
    private Long id;

    private String fileName;

    private long fileSize;

    private String mimeType;

    private Long sender;

}
