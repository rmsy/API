package tc.oc.projectares.api.backend;

import java.util.Collection;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.World;

import tc.oc.projectares.api.Match;
import tc.oc.projectares.api.MatchManager;
import tc.oc.projectares.api.Player;
import tc.oc.projectares.api.PlayerManager;

/**
 * Interface that is implemented by the API implementation is order to cleanly
 * back static API methods.
 *
 * It is much easier to implement an interface and set it in a static class
 * than it is to overwrite static methods using reflection, so this interface
 * is used in conjunction with {@link BackendManager}.
 *
 * @see BackendManager
 */
public interface Backend {
    /** @see PlayerManager#getPlayer */
    @Nullable Player getPlayer(@Nonnull org.bukkit.entity.Player bukkit);

    /** @see MatchManager#getMatches */
    @Nonnull Collection<Match> getMatches();

    /** @see MatchManager#getMatch() */
    @Nullable Match getMatch();

    /** @see MatchManager#getMatch(World) */
    @Nullable Match getMatch(@Nonnull World world);
}
