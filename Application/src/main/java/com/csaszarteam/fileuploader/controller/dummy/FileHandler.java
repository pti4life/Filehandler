package com.csaszarteam.fileuploader.controller.dummy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public interface FileHandler {

    Logger log = LoggerFactory.getLogger(FileHandler.class);

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    default void closeReader(Reader reader){
        try {
            reader.close();
            log.info("Reader successfully closed");
        } catch (IOException e) {
            e.printStackTrace();
            log.error("Error while closing the reader");
        }
    }

    default void closeWriter(Writer writer){
        try {
            writer.flush();
            writer.close();
            log.info("Writer successfully closed");
        } catch (IOException e) {
            e.printStackTrace();
            log.error("Error while closing the writer");
        }
    }
}