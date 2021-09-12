package dev.salmonllama.djehuty;

import javax.security.auth.login.LoginException;

// LINK: https://discord.com/api/oauth2/authorize?client_id=878644334633836564&permissions=2147485696&scope=bot

public class Main {
    public static void main(String[] args) {
        Djehuty djehuty;

        try {
            djehuty = new Djehuty("ODc4NjQ0MzM0NjMzODM2NTY0.YSELTQ.nV1vSdjfNqBeCTwTXgk0F7rKRoE");
        } catch (LoginException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
