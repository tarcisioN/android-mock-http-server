package com.github.tarcisioN.android.http.file;

import java.io.File;

import com.github.tarcisioN.android.http.HttpRequest;

/**
 * Reads a {@link HttpRequest} from file and reconstructs it.
 * 
 * @see HttpRequestFileWriter
 * @author kristof
 */
interface HttpRequestFileReader {

    /**
     * Reqds a HttpRequest that is stored in file(s) and reconstructs it.
     * 
     * @param httpRequestFile File in which all http.http.android request properties are stored except entity.
     * @param httpRequestEntityFile File in which http.http.android request entity is stored. Entity is optional. If given file does not
     *            exist entity in returned request will be <code>null</code>.
     * @return Initialized Http Request.
     */
    HttpRequest read(final File httpRequestFile, final File httpRequestEntityFile);

}
