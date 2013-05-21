package tc.oc.api;

import javax.annotation.Nonnull;

public interface Player {
    @Nonnull org.bukkit.entity.Player getBukkit();

    @Nonnull Team getTeam();
}
