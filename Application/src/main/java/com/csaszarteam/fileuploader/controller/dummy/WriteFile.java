package com.csaszarteam.fileuploader.controller.dummy;

import java.io.Writer;

public interface WriteFile extends FileHandler {

    <T> void writeToJson(T toWrite);

    Writer createWriter();

}
