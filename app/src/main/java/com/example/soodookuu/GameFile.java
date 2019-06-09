package com.example.soodookuu;

import java.io.File;
import java.io.FileOutputStream;

public class GameFile {

    private static GameFile gameFile;
    private String fileDirectory;
    private String fileName;
    private String fileExtension;
    private File file;
    private FileOutputStream outputStream;

    private GameFile()
    {
        fileName = "savefile";
        fileExtension = "json";
    }

    public GameFile getGameFile()
    {
        if(gameFile == null)
        {
            gameFile = new GameFile();
        }
        return gameFile;
    }

    public boolean createGameFile()
    {
        GlobalApplication app = new GlobalApplication();
        file = new File(app.getAppContext().getFilesDir(), fileName);
        return true;
    }

    public boolean deleteGameFile()
    {
        file = null;
        return true;
    }

    public boolean checkForSavedGame()
    {
        if(file != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean generateGameFile(int[] gameArray)
    {
        return true;

    }

    public boolean updateGameFile()
    {
        return true;
    }

}
