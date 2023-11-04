package screens;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import utilities.Dates;

import static java.awt.Color.blue;

public class GoodsAssignment extends MainWindow{
    public GoodsAssignment(Screen screen){
        super(screen);
    }

    private String goodsAssignmentScreens = screensRootFolder+"\\goods_asignment\\";
    private Pattern goods_assignment_hdr = new Pattern(goodsAssignmentScreens+"goodsAssignmentHDR.png");
    private Pattern selectable_goods_txt = new Pattern(goodsAssignmentScreens+"selectable goods_txt.png");
    private Pattern address_fld = new Pattern(goodsAssignmentScreens+"address_fld.png");
    private Pattern kunden_reference_fld = new Pattern(goodsAssignmentScreens+"kunden_reference_fld.png");
    private Pattern liferdatum_fld = new Pattern(goodsAssignmentScreens+"liferdatum_fld.png");
    private Pattern ok_btn = new Pattern(goodsAssignmentScreens+"ok_btn.png");
    private Pattern action_fld = new Pattern(goodsAssignmentScreens+"action_fld.png");
    private Pattern ok_btn2 = new Pattern(goodsAssignmentScreens+"ok_btn2.png");

    public void waitGoodsAssignmentWindow() throws FindFailed {
        screen.wait(goods_assignment_hdr,10.0);
    }

    public void chooseSelectedGoods() throws FindFailed {
        screen.doubleClick(selectable_goods_txt.targetOffset(13,69));
    }

    public void openAddressList() throws FindFailed {
        screen.click(address_fld.targetOffset(719,0));
    }

    public void selectKundenReferenceFld() throws FindFailed {
        screen.hover(kunden_reference_fld);
        screen.click(kunden_reference_fld.targetOffset(110,0));
    }

    public void enterKundenReferenceFld(String kunden_reference){
        screen.type(kunden_reference);
    }

    public void selectLiferdatumFld() throws FindFailed {
        screen.click(liferdatum_fld.targetOffset(90,0));
    }

    public void enterLiferdatum(String date){
        screen.type(date);
    }

    public void applyGoodsAssignmentWindow() throws FindFailed {
        screen.click(ok_btn);
    }

    public void selectAction() throws FindFailed {
        screen.hover(action_fld);
        screen.click(action_fld.targetOffset(271,0));
    }

    public void enterAction(){
        screen.type("ab");
        screen.type(Key.ENTER);
    }

    public void applyGoodsDistribution() throws FindFailed {
        screen.click(ok_btn2);
    }

    public void completeGoodsAssignmentWindow() throws FindFailed, InterruptedException {

        TransportOrders to = new TransportOrders(screen);
//        waitGoodsAssignmentWindow();
        chooseSelectedGoods();
        openAddressList();

        ShimpmentAddressListWindow salw = new ShimpmentAddressListWindow(screen);
        salw.waitShipmentAddressListWindow();
        salw.selectName1Fld();
        salw.clearName1Fld();
        salw.enterName1Fld("ISL2222");
        salw.selectAddress();

        waitGoodsAssignmentWindow();
        selectKundenReferenceFld();
        enterKundenReferenceFld("1");
        selectLiferdatumFld();
        enterLiferdatum(Dates.getCurrentDate());
        applyGoodsAssignmentWindow();

        to.clickAddLoadingPoint();
        waitGoodsAssignmentWindow();
        selectAction();
        enterAction();
        chooseSelectedGoods();
        applyGoodsDistribution();
        openAddressList();

        salw.waitShipmentAddressListWindow();
        salw.selectName1Fld();
        salw.clearName1Fld();
        salw.enterName1Fld("ford werke k");
        salw.selectAddress();

        waitGoodsAssignmentWindow();
        selectKundenReferenceFld();
        enterKundenReferenceFld("1");
        selectLiferdatumFld();
        enterLiferdatum(Dates.getTomorrowDate());
        applyGoodsAssignmentWindow();
    }

//    public static void main(String[] args) throws InterruptedException, FindFailed {
//        Thread.sleep(4000);;
//        GoodsAssignment ga = new GoodsAssignment(new Screen());
//        ga.waitGoodsAssignmentWindow();
//        ga.chooseSelectedGoods();
//        ga.openAddressList();
//    }

}
