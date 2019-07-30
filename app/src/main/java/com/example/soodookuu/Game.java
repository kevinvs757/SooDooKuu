package com.example.soodookuu;


/*
 * This class is meant to hold data structures that describe a particular game. Logic as
 * to handling the logic/manipulation of the data that is put into the game is handled
 * elsewhere in GameBuilder.
 */
public class Game {

    private int[][] boardValues = new int[9][9]; // column, row
    private String difficulty;

    // creates a blank game, all values 0
    Game()
    {
        for(int r=0; r<9; r++)
        {
            for(int c=0; c<9; c++)
            {
                boardValues[r][c] = 0;
            }
        }
    }

    public void printReadableBoardValues()
    {
        System.out.print(getReadableBoardValues());
    }

    public String getReadableBoardValues()
    {
        String stringOfValues = "";
        for(int r=0; r<9; r++)
        {
            for(int c=0; c<9; c++)
            {
                stringOfValues = stringOfValues + boardValues[r][c] + " ";
                if(c == 8)
                {
                    stringOfValues = stringOfValues + "\r\n";
                }
            }
        }
        return stringOfValues;
    }

    public int[][] getBoardValues()
    {
        return this.boardValues;
    }
}
