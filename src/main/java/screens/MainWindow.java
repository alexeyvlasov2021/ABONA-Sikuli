package screens;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainWindow {
    protected Screen screen;
    protected String screensRootFolder = "C:\\Users\\Alexey\\IdeaProjects\\ABONA-Sikuli\\src\\main\\resources\\abona_root";
//            "C:\\Users\\alexe\\IdeaProjects\\VlasovTest\\src\\main\\resources\\abona_root";
//            "C:\\Users\\alexe\\OneDrive\\Documents\\abona_root";



    public MainWindow(Screen screen){
        this.screen = screen;
    }

    public void shiftCursorXtimes(int x){
        for (int i=1; i<=x; i++){
            screen.type(Key.TAB);
        }
    }

//    public static void main(String[] args) throws FindFailed, InterruptedException {
//
//    }
}