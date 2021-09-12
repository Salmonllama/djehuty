package dev.salmonllama.djehuty.commands;

import dev.salmonllama.djehuty.handler.Command;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

public class EchoCommand implements Command {
    @Override
    public CommandData getCommandData() {
        return new CommandData("echo", "Echos the given content. Requires permission to send messages.")
                .addOptions(new OptionData(OptionType.STRING, "content", "the content to echo").setRequired(true));
    }

    @Override
    public void onCommand(SlashCommandEvent event) {
        event.reply(event.getOption("content").getAsString()).queue();
    }
}
