package tc.oc.projectares.api;

import java.util.Set;

import javax.annotation.Nonnull;

import org.bukkit.ChatColor;

public interface Team {
    @Nonnull Set<Player> getMembers();

    @Nonnull boolean isParticipating();

    @Nonnull boolean isObserving();

    @Nonnull String getName();

    void setName(@Nonnull String newName);

    @Nonnull String getColoredName();

    @Nonnull ChatColor getColor();

    void setColor(@Nonnull ChatColor newColor);

    void broadcast(String message);
}
