package com.example.soodookuu;

public class GameBuilder {

    private static GameBuilder gameBuilder;

    private GameBuilder() {

    }

    public static GameBuilder getGameBuilder()
    {
        if (gameBuilder == null)
        {
            gameBuilder = new GameBuilder();
        }
        return gameBuilder;
    }

    private void buildNewGame (String dumb)
    {


    }
    private void buildNewGame ()
    {

    }

}
