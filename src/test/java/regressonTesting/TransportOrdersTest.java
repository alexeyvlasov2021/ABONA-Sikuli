package regressonTesting;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.KeyModifier;
import org.testng.annotations.Test;
import screens.*;
import org.sikuli.script.Screen;
import utilities.Dates;

public class TransportOrdersTest {
    @Test(invocationCount = 3)
    static void test() throws InterruptedException, FindFailed {

        Settings.MoveMouseDelay = 3;
        Settings.Highlight = true;
//        Settings.MinSimilarity = 0.9;
        Screen s = new Screen();

        OrderMenu om = new OrderMenu(s);
        ConnectionWindow cw = new ConnectionWindow(s);
        TransportOrders to = new TransportOrders(s);

        NewDocument nd = new NewDocument(s);
        NewEdit ne = new NewEdit(s);

        Thread.sleep(4000);
        cw.activateConnectionWindow();

        om.openOrders();
        om.openTransportOrders();
        to.waitTransportOrder();
        to.selectCustomer("32114");
        to.clickAdd();

        nd.waitNewDocumentForm();
        nd.completeNewDocumentWindow();

        ne.waitNewEditWindow();
        ne.competeNewEditWindow();

        Goods g = new Goods(s);
        g.waitGoodsWindow();
        g.completeGoodsWindow();

        GoodsAssignment ga = new GoodsAssignment(new Screen());
        ga.waitGoodsAssignmentWindow();
        ga.completeGoodsAssignmentWindow();

        to.saveOrder();
        to.applySaving();
        to.closeOrder();

    }
}
