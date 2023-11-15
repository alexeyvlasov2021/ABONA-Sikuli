package screens;

import org.sikuli.basics.Settings;
import org.sikuli.script.*;

public class ShimpmentAddressListWindow extends MainWindow{
    public ShimpmentAddressListWindow(Screen screen){
        super(screen);
    }
    private String ShipmentAddressScreens =screensRootFolder+"\\shipment_address_list\\";
    private Pattern shipment_address_list_hdr = new Pattern(ShipmentAddressScreens+"shipment_address_list_hdr.png");
    private Pattern name1_fld = new Pattern(ShipmentAddressScreens+"shipment_address_list_hdr.png").targetOffset(-175, 217);
    private Pattern address_fld = new Pattern(ShipmentAddressScreens+"shipment_address_list_hdr.png").targetOffset(-189, 237);
//            new Pattern(ShipmentAddressScreens+"name1_fld.png");

    public void waitShipmentAddressListWindow() throws FindFailed {
        screen.wait(shipment_address_list_hdr,10.0);
    }
    public void selectName1Fld() throws FindFailed {
        screen.click(name1_fld);
    }

    public void clearName1Fld() throws FindFailed, InterruptedException {
//        screen.doubleClick(name1_fld.targetOffset(7,25));
//        screen.type(Key.CTRL+"a");
//        screen.type("a", KeyModifier.CTRL);
        screen.keyDown(Key.CTRL);
        screen.type("a");
        screen.keyUp(Key.CTRL);
        Thread.sleep(1000);
        screen.type(Key.BACKSPACE);
    }

    public void enterName1Fld(String name1){
        screen.type(name1);
    }

    public void selectAddress() throws FindFailed {
        screen.doubleClick(address_fld);
    }

//    public static void main(String[] args) throws InterruptedException, FindFailed {
//        Thread.sleep(4000);
//        Settings.MoveMouseDelay = 3;
//        Settings.Highlight = true;
//
//        ShimpmentAddressListWindow salw = new ShimpmentAddressListWindow(new Screen());
//        salw.waitShipmentAddressListWindow();
//        salw.selectName1Fld();
//        salw.clearName1Fld();
//        salw.enterName1Fld("ISL2222");
//        salw.selectAddress();
//    }

}
