package tc.oc.projectares.api.backend;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Responsible for storing the current instance that backs Project Ares static
 * API calls.
 *
 * This class is primarily intended for internal usage and should not be called
 * by users of the API.
 *
 * @see Backend
 */
public final class BackendManager {
    private BackendManager() { }

    /**
     * Gets the backend that is currently registered. This method should not be
     * called by users of the API, but rather should be accessed indirectly by
     * calling static API entry points.
     *
     * @return {@link Backend} instance of the API implementation
     * @throws IllegalStateException if there is not a backend registered
     */
    public static synchronized @Nonnull Backend getBackend() {
        if(hasBackend()) {
            return backend;
        } else {
            throw new IllegalStateException("backend has not been set");
        }
    }

    /**
     * Indicates whether there is a backend registered.
     *
     * @return true if there is a nonnull backend, false otherwise
     */
    public static synchronized boolean hasBackend() {
        return backend != null;
    }

    /**
     * Sets the new backend. Should only be called by the API implementation.
     *
     * @param newBackend New {@link Backend} instance or null to clear the
     *        stored backend
     * @return Backend that was registered before replaced by this backend
     */
    public static synchronized @Nullable Backend setBackend(@Nullable Backend newBackend) {
        Backend oldBackend = backend;
        backend = newBackend;
        return oldBackend;
    }

    /** Internal backend store */
    private static @Nullable Backend backend = null;
}
