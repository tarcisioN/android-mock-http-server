package com.github.tarcisioN.android.http.file;

import java.io.File;

import com.github.tarcisioN.android.http.HttpRequest;

/**
 * Writes a {@link HttpRequest} to file.
 * 
 * @see HttpRequestFileReader
 * @author kristof
 */
public interface HttpRequestFileWriter {

    /**
     * Writes a {@link HttpRequest} to file.
     * 
     * @param request The http.http.android request to persist.
     * @param httpRequestFile File in which all http.http.android request properties will be stored except entity.
     * @param httpRequestEntityFile File in which http.http.android request entity will be stored. Entity is optional. If http.http.android request
     *            does not have entity this file will not be created.
     */
    void write(final HttpRequest request, final File httpRequestFile, final File httpRequestEntityFile);

}
