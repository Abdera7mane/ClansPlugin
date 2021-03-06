package me.abdera7mane.clans;

import me.abdera7mane.clans.types.Clan;
import me.abdera7mane.clans.types.PlayerAdapter;

import org.bukkit.OfflinePlayer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ClanZAPI {

    @Nullable
    Clan createClan(@NotNull String name, @NotNull OfflinePlayer leader);

    @Nullable
    Clan getClan(String name);

    @NotNull
    PlayerAdapter getPlayerAdapter(@NotNull OfflinePlayer player);

    @Nullable
    default Clan getPlayerClan(OfflinePlayer player) {
        return this.getPlayerAdapter(player).getClan();
    }

    default boolean clanExists(@NotNull String name) {
        return this.getClan(name.toLowerCase()) != null;
    }

    default boolean PlayerHasClan(@NotNull OfflinePlayer player) {
        return this.getPlayerClan(player) != null;
    }

    void saveClan(@NotNull Clan clan);

    void savePlayerAdapter(@NotNull PlayerAdapter adapter);

}
