package dev.salmonllama.djehuty.handler;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

import java.util.concurrent.CompletableFuture;

public interface Command {
    CommandData getCommandData();
    void onCommand(SlashCommandEvent event);

    default void invoke(final SlashCommandEvent event) {
        CompletableFuture.runAsync(() -> onCommand(event));
    }
}
