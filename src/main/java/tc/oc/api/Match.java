package tc.oc.api;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nonnull;

import org.bukkit.World;

public interface Match {
    @Nonnull World getWorld();

    @Nonnull UUID getUUID();

    @Nonnull boolean isRunning();

    @Nonnull boolean start();

    @Nonnull boolean end();

    @Nonnull boolean end(@Nonnull Team winningTeam);

    @Nonnull Collection<Player> getPlayers();

    @Nonnull Set<Player> getParticipatingPlayers();

    @Nonnull Set<Player> getSpectatingPlayers();

    void broadcast(String message);

    @Nonnull Set<Team> getTeams();

    @Nonnull Set<Team> getParticipatingTeams();

    @Nonnull Set<Team> getSpectatingTeams();

    Team getFirstOther(Team exclude);
}
