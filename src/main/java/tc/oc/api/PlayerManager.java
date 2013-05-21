package tc.oc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import tc.oc.api.backend.BackendManager;

import com.google.common.base.Preconditions;

/**
 * Provides an entry point for getting and querying API players.
 *
 * @see Player
 */
public final class PlayerManager {
    private PlayerManager() { }

    /**
     * Gets the API's player instance that corresponds to the Bukkit player
     * instance specified.
     *
     * @param bukkit Bukkit {@link org.bukkit.entity.Player} instance to
     *               indicate which player to search for
     * @return API {@link Player} instance that corresponds to the Bukkit
     *         instance
     * @throws NullPointerException if the specified instance is null
     */
    public static @Nullable Player getPlayer(@Nonnull org.bukkit.entity.Player bukkit) {
        Preconditions.checkNotNull(bukkit, "bukkit");

        return BackendManager.getBackend().getPlayer(bukkit);
    }
}
