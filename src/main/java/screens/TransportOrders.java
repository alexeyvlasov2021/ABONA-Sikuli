package screens;
import org.sikuli.script.*;

public class TransportOrders extends MainWindow{
    public TransportOrders(Screen screen){
        super(screen);
    }

    private String transportOrderScreens = screensRootFolder+"\\transport_order\\";
    private Pattern quick_search_mnu = new Pattern(transportOrderScreens+"controls.png").targetOffset(90, 74);
//            = new Pattern(transportOrderScreens +"quick_search.png");
    private Pattern quick_search_fld = new Pattern(transportOrderScreens+"controls.png").targetOffset(212, 73);
    private Pattern add_btn = new Pattern(transportOrderScreens +"add_btn.png");
    private Pattern transport_orders_controls = new Pattern(transportOrderScreens+"controls.png");
    private Pattern add_loading_point_btn = new Pattern(transportOrderScreens+"controls.png").targetOffset(-20, 347);
//            new Pattern(transportOrderScreens+"add_loading_point_btn.png");

    public void waitTransportOrder() throws FindFailed {
        screen.wait(transport_orders_controls,30.0);
    }
    public void openQuickSearchList() throws FindFailed {
//        Region r = screen.find(quick_search_mnu);
//        screen.click(r.offset(170,0));
        screen.click(quick_search_mnu);
    }
    public void selectCustomerNoInQuickSearch(){
        screen.type("C");
        screen.type(Key.ENTER);
    }
    public void selectQuickSearchField() throws FindFailed {
//        Region r = screen.find(quick_search_mnu);
//        screen.click(r.offset(235,0));
        screen.click(quick_search_fld);
    }

    public void enterCustomerNo(String number) throws InterruptedException {
        screen.type(number);
        screen.type(Key.ENTER);
        Thread.sleep(3000);
    }
    public void selectCustomer(String customerNo) throws FindFailed, InterruptedException {
        openQuickSearchList();
        selectCustomerNoInQuickSearch();
        selectQuickSearchField();
        enterCustomerNo(customerNo);
    }
    public void clickAdd() throws FindFailed, InterruptedException {
        screen.click(add_btn);
    }

    public void clickAddLoadingPoint() throws FindFailed {
        screen.click(add_loading_point_btn);
    }

//    public static void main(String[] args) throws FindFailed, InterruptedException {
//        Thread.sleep(4000);
//        TransportOrders to = new TransportOrders(new Screen());
////        to.openQuickSearchList();
////        to.selectCustomerNoInQuickSearch();
////        to.selectQuickSearchField();
////        to.enterCustomerNo("32114");
//        to.selectCustomer("32114");
//        to.clickAdd();
//    }
}
