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

    // for unit-testing purposes
    private void dumbBuilderAlgorithm (Game game)
    {
        int min = 1;
        int max = 9;
        int range = max - min + 1;

        for(int r=0; r<9; r++)
        {
            for (int c = 0; c < 9; c++)
            {
                if ((r + c) % 3 == 0)
                {
                    game.getBoardValues ()[c][r] = (int) Math.random() * range + 1;
                }
            }
        }
    }

    /**
     * The builder algorithm:
     *
     * 1. Generate a full grid of numbers (fully filled in). This step is more complex as it seems as we cannot just randomly generate numbers to fill in the grid.
     * We have to make sure that these numbers are positioned on the grid following the Sudoku rules. To do so will use a sudoku solver algorithm (backtracking
     * algorithm) that we will apply to an empty grid. We will add a random element to this solver algorithm to make sure that a new grid is generated every
     * time we run it.
     *
     * 2. From our full grid, we will then remove 1 value at a time.
     *
     * 3. Each time a value is removed we will apply a sudoku solver algorithm to see if the grid can still be solved and to count the number of solutions it
     * leads to.
     *
     * 4. If the resulting grid only has one solution we can carry on the process from step 2. If not we will have to put the value we took away back in the grid.
     *
     * 5. We can repeat the same process (from step 2) several times using a different value each time to try to remove additional numbers, resulting in a more
     * difficult grid to solve. The number of attempts we will use to go through this process will have an impact on the difficulty level of the resulting grid.
     */

    private void builderAlgorithm(Game game)
    {

    }

    /**
     * The solver (backtracking) algorithm:
     *
     * A backtracking algorithm is a recursive algorithm that attempts to solve a given problem by testing all possible paths towards a solution until a solution
     * is found. Each time a path is tested, if a solution is not found, the algorithm backtracks to test another possible path and so on til a solution is found
     * or all paths have been tested.
     */

    private void solverAlgorithm (Game game)
    {


    }


    private Game buildNewGame ()
    {
        Game game = new Game();

        dumbBuilderAlgorithm(game);

        return game;

    }

}
