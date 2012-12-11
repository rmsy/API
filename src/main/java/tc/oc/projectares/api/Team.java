package tc.oc.projectares.api;

import java.util.Set;

import javax.annotation.Nonnull;

import org.bukkit.ChatColor;

/**
 * Represents a team that is either spectating or participating in a match.
 */
public interface Team {
    /**
     * Gets the members of the team in no specific order.
     *
     * @return Immutable set of members
     */
    @Nonnull Set<Player> getMembers();

    /**
     * Indicates whether members of the team may participate in a match.
     *
     * This method always returns the same value every time it is called.
     *
     * @return true if the team can participate, false otherwise
     */
    boolean canParticipate();

    /**
     * Indicates whether the team is currently participating in a match.
     *
     * Equivalent to checking that the team can participate and that the match
     * is currently running.
     *
     * @return true if the team is currently participating, false otherwise
     */
    boolean isParticipating();

    /**
     * Indicates whether the team is currently spectating a match.
     *
     * This will return true even if the team may be able to participate but is
     * currently spectating because the match has not yet started.
     *
     * @return true if the team is currently spectating, false otherwise
     */
    boolean isSpectating();

    /**
     * Gets the name of the team.
     *
     * This method will return either the initial name or any modifications
     * applied with {@link #setName}. Getting the initial name is supported by
     * {@link #getInitialName}.
     *
     * @return name of the team excluding any colors or formatting
     */
    @Nonnull String getName();

    /**
     * Gets the initial name of the team as specified by the map.
     *
     * This method always returns the same value every time it is called.
     *
     * @return initial name of the team excluding colors or formatting
     */
    @Nonnull String getInitialName();

    /**
     * Gets the colorized name of the team.
     *
     * This method will use any custom-set name or color in its output. Get the
     * initial name and color by calling {@link #getInitialName} and
     * {@link #getInitialColor}.
     *
     * @return name of the team including any colors or formatting
     */
    @Nonnull String getColoredName();

    /**
     * Sets a custom name for the team.
     *
     * @param newName new name for the team (exclude colors)
     * @throws NullPointerException if the new name is null
     */
    void setName(@Nonnull String newName);

    /**
     * Gets the color for the team.
     *
     * This method will return either the initial color for the team or any
     * custom color set via {@link #setColor}. Getting the initial color is
     * supported by {@link #getInitialColor}.
     *
     * @return color of the team
     */
    @Nonnull ChatColor getColor();

    /**
     * Gets the initial color for the team as specified by the map.
     *
     * This method always returns the same value every time it is called.
     *
     * @return initial color for the team
     */
    @Nonnull ChatColor getInitialColor();

    /**
     * Sets a custom color for the team.
     *
     * @param newColor new color for the team
     * @throws NullPointerException if the new color is null
     */
    void setColor(@Nonnull ChatColor newColor);

    /**
     * Broadcasts a message to all members of the team.
     *
     * Equivalent to looping through all members of the team and sending the
     * message using Bukkit's {@link org.bukkit.entity.Player#sendMessage}.
     *
     * @param message message to be broadcasted
     * @throws NullPointerException if the message is null
     */
    void broadcastMessage(@Nonnull String message);
}
