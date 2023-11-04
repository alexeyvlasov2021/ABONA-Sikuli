package screens;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ConnectionWindow extends MainWindow{
    protected String connectionWindowRoot =screensRootFolder+"\\connection_window\\";

    protected Pattern connectionWidnowHeader = new Pattern(connectionWindowRoot+"connection_window_header.png");
    public ConnectionWindow(Screen screen){
        super(screen);
    }
    public void activateConnectionWindow() throws FindFailed {
        screen.click(connectionWidnowHeader);
    }
}
