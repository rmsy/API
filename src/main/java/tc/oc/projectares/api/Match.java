package tc.oc.projectares.api;

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

    @Nonnull Set<Player> getObservingPlayers();

    Player getPlayer(org.bukkit.entity.Player player);

    @Nonnull Player addPlayer(org.bukkit.entity.Player player);

    void removePlayer(org.bukkit.entity.Player player);

    void removeAllPlayers();

    void broadcast(String message);

    @Nonnull Set<Team> getTeams();

    @Nonnull Set<Team> getParticipatingTeams();

    @Nonnull Set<Team> getObservingTeams();

    Team getFirstOther(Team exclude);
}
