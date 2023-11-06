package screens;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class OrderMenu extends MainWindow{
    private String orderMenuScreens = screensRootFolder+"\\order_menu\\";

    private Pattern orderMenu = new Pattern(orderMenuScreens+"order_mnu.png");
    private Pattern transportOrdersMenu = new Pattern(orderMenuScreens+"transportorders_mnu.png");
    public OrderMenu(Screen screen){
        super(screen);
    }

    public void openOrders() throws FindFailed {
        screen.wait(orderMenu,30.0);
        screen.click(orderMenu);
    }

    public void openTransportOrders() throws FindFailed {
        screen.wait(transportOrdersMenu,30.0);
        screen.click(transportOrdersMenu);
    }

//    public static void main(String[] args) throws FindFailed, InterruptedException {
//        OrderMenu om = new OrderMenu(new Screen());
//        Thread.sleep(4000);
//        om.openOrders();
//        Thread.sleep(1000);
//        om.openTransportOrders();
//    }

}
