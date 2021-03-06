package me.abdera7mane.clans.events;

import me.abdera7mane.clans.types.Clan;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import org.jetbrains.annotations.NotNull;

public class ClanDeleteEvent extends Event implements Cancellable {
    private final Clan clan;
    private boolean isCancelled;
    private static final HandlerList handlers = new HandlerList();

    public ClanDeleteEvent(Clan clan) {
        this.clan = clan;
    }

    @NotNull
    public Clan getClan() {
        return this.clan;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
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
