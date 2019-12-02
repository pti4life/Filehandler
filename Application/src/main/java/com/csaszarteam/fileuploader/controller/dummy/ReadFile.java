package com.csaszarteam.fileuploader.controller.dummy;

import java.io.Reader;

public interface ReadFile extends FileHandler {

    Reader createReader();

    <T> T readFromJson(T readTo);

}