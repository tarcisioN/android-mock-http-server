package com.github.tarcisioN.android.http;

/**
 * Abstract {@link HttpRequestMatchingFilter} implementation which is able to deal with setting and returning next
 * {@link HttpRequestMatchingFilter} in chain.
 * <p/>
 * Filter logic needs to be implemented in extending classes.
 * 
 * @author kristof
 */
public abstract class AbstractHttpRequestMatchingFilter implements HttpRequestMatchingFilter {

    private HttpRequestMatchingFilter nextFilter;

    public final void setNext(final HttpRequestMatchingFilter filter) {
        nextFilter = filter;

    }

    public final HttpRequestMatchingFilter next() {
        return nextFilter;
    }

}
