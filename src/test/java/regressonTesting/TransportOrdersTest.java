package regressonTesting;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.KeyModifier;
import org.testng.annotations.Test;
import screens.*;
import org.sikuli.script.Screen;
import utilities.Dates;

public class TransportOrdersTest {
    @Test
    static void test() throws InterruptedException, FindFailed {

        Settings.MoveMouseDelay = 4;
        Settings.Highlight = true;
        Screen s = new Screen();

        OrderMenu om = new OrderMenu(s);
        ConnectionWindow cw = new ConnectionWindow(s);
        TransportOrders to = new TransportOrders(s);
        NewDocument nd = new NewDocument(s);

        Thread.sleep(4000);
        cw.activateConnectionWindow();
//        om.openOrders();
////        Thread.sleep(3000);
//        om.openTransportOrders();
//        to.waitTransportOrder();
//        to.selectCustomer("32114");
//        to.clickAdd();
//        nd.waitNewDocumentForm();
//        nd.completeNewDocumentWindow();

        GoodsAssignment ga = new GoodsAssignment(new Screen());
        ga.waitGoodsAssignmentWindow();
//

        ga.completeGoodsAssignmentWindow();




    }
}