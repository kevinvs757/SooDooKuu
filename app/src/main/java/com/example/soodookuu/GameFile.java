package com.example.soodookuu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class GameFile {


    Gson gson = new GsonBuilder().create();
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

    public boolean createEmptyGameFile()
    {
        GlobalApplication app = new GlobalApplication();
        FileOutputStream fs = null;
        try
        {
            file = new File(app.getAppContext().getFilesDir(), fileName);
            if (file != null)
            {
                fs = new FileOutputStream(file);
                if (!file.exists())
                {
                    file.createNewFile();
                }

                writeJsonStart(fs);



                writeJsonEnd(fs);

                fs.flush();
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            return false;
        }
        finally
        {
            try {
                if (fs != null)
                {
                    fs.close();
                }
            }
            catch (Exception ioe) {
                System.out.println("Error in closing the Stream");
            }
        }

        return true;
    }

    public boolean deleteGameFile()
    {
        file = null;
        return true;
    }

    public boolean gameFileExists()
    {
        if(file != null && file.exists())
        {
            return true;
        }
        return false;
    }

    public boolean generateGameFile(int[] gameArray)
    {
        return true;

    }

    public boolean updateGameFile(Game game)
    {
        return true;
    }

    private void writeJsonStart(FileOutputStream fs) throws IOException
    {
        byte[] bytesArray = "[".getBytes();
        fs.write(bytesArray);
    }

    private void writeJsonEnd(FileOutputStream fs) throws IOException
    {
        byte[] bytesArray = "]".getBytes();
        fs.write(bytesArray);
    }

}
