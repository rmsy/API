package tc.oc.api;

import java.util.Collection;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.World;

import tc.oc.api.backend.BackendManager;

import com.google.common.base.Preconditions;

/**
 * Provides an entry point for getting {@link Match} instances.
 */
public final class MatchManager {
    private MatchManager() { }

    /**
     * Gets a list of matches registered with the server.
     *
     * @return collection of registered matches
     */
    public static @Nonnull Collection<Match> getMatches() {
        return BackendManager.getBackend().getMatches();
    }

    /**
     * Gets the match registered in a single-match environment.
     *
     * A single match environment is one where only one match will be running
     * on the server. In that case, this method should always return a valid
     * match object, though it is not guaranteed.
     *
     * @return only match running or null if there are either no matches
     *         running or more than one
     */
    public static @Nullable Match getMatch() {
        return BackendManager.getBackend().getMatch();
    }

    /**
     * Gets the match registered in a specified world.
     *
     * @param world search term for the match
     *
     * @return match that is registered in the world or null if there is not one
     * @throws NullPointerException if world is null
     */
    public static @Nullable Match getMatch(@Nonnull World world) {
        Preconditions.checkNotNull(world, "world");

        return BackendManager.getBackend().getMatch(world);
    }
}
