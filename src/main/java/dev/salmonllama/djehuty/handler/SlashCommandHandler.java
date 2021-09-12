package dev.salmonllama.djehuty.handler;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SlashCommandHandler extends ListenerAdapter {
    private JDA jda;
    private List<Command> commands;

    public SlashCommandHandler(JDA jda) {
        this.jda = jda;

        commands = new ArrayList<>();
    }

    public void registerCommand(Command command) {
        jda.updateCommands().addCommands(command.getCommandData());

        commands.add(command);
    }

    @Override
    public void onSlashCommand(SlashCommandEvent event) {
        String commandName = event.getName();

        commands.forEach(command -> {
            if (command.getCommandData().getName().equals(commandName)) {
                command.invoke(event);
            }
        });
    }
}
