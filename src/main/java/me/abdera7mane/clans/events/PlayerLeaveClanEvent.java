package me.abdera7mane.clans.events;

import me.abdera7mane.clans.types.Clan;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import org.jetbrains.annotations.NotNull;

public class PlayerLeaveClanEvent extends Event implements Cancellable {
    private final Clan clan;
    private final OfflinePlayer player;
    private final Clan.LeaveReason reason;
    private boolean isCancelled;
    private static final HandlerList handlers = new HandlerList();

    public PlayerLeaveClanEvent(OfflinePlayer player, Clan clan, Clan.LeaveReason reason) {
        this.player = player;
        this.clan = clan;
        this.reason = reason;
    }

    @NotNull
    public OfflinePlayer getPlayer() {
        return this.player;
    }

    @NotNull
    public Clan getClan() {
        return this.clan;
    }

    public Clan.LeaveReason getReason() {
        return this.reason;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        isCancelled = cancel;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

}
