package com.github.tarcisioN.android.http;

import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;
import org.simpleframework.http.Request;

/**
 * Converts a Simple framerwork {@link Request} into a {@link FullHttpRequest}.
 * 
 * @author kristof
 */
class RequestConvertor {

    private static final String TAG = "RequestConvertor";

    public static FullHttpRequest convert(final Request request) {
        byte[] data = null;
        try {

            final InputStream inputStream = request.getInputStream();
            try {
                data = IOUtils.toByteArray(inputStream);
            } finally {
                inputStream.close();
            }

        } catch (final IOException e) {
            Log.e(TAG, "IOException when getting request content.", e);
        }

        final FullHttpRequestImpl httpRequest = new FullHttpRequestImpl();
        httpRequest.domain(request.getAddress().getDomain());
        httpRequest.port(request.getAddress().getPort());
        httpRequest.method(Method.valueOf(request.getMethod()));
        httpRequest.path(request.getPath().getPath());
        if (data.length > 0) {
            httpRequest.content(data);
        }

        for (final String headerField : request.getNames()) {
            for (final String headerFieldValue : request.getValues(headerField)) {
                httpRequest.httpMessageHeader(headerField, headerFieldValue);
            }
        }

        for (final Entry<String, String> entry : request.getQuery().entrySet()) {
            httpRequest.queryParameter(entry.getKey(), entry.getValue());
        }
        return httpRequest;

    }

}
