package dev.salmonllama.djehuty;


import dev.salmonllama.djehuty.commands.EchoCommand;
import dev.salmonllama.djehuty.handler.SlashCommandHandler;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Djehuty {
    private String token;
    private JDA jda;
    private SlashCommandHandler commandHandler;

    public Djehuty(String token) throws LoginException {
        // Instantiate the JDA object
        jda = JDABuilder.createLight(token).build();

        // Instantiate the Command Handler
        commandHandler = new SlashCommandHandler(jda);

        // Register commands
        commandHandler.registerCommand(new EchoCommand());
    }
}
