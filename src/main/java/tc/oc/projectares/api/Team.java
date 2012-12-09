package tc.oc.projectares.api;

import java.util.Set;

import javax.annotation.Nonnull;

public interface Team {
    @Nonnull Set<Player> getMembers();
}
