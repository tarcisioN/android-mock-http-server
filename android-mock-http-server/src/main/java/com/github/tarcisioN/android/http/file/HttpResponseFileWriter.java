package com.github.tarcisioN.android.http.file;

import java.io.File;

import com.github.tarcisioN.android.http.HttpResponse;

/**
 * Writes a {@link HttpResponse} to file.
 * 
 * @see HttpResponseFileReader
 * @author kristof
 */
public interface HttpResponseFileWriter {

    /**
     * Writes a {@link HttpResponse} to file.
     * 
     * @param response The http.http.android response to persist.
     * @param httpResponseFile File in which all http.http.android response properties will be stored except entity.
     * @param httpResponseEntityFile File in which http.http.android response entity will be stored. Entity is optional. If http.http.android response
     *            does not have entity this file will not be created.
     */
    void write(final HttpResponse response, final File httpResponseFile, final File httpResponseEntityFile);

}
