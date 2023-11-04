package screens;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewEdit extends MainWindow{
    public NewEdit(Screen screen){
        super(screen);
    }

    private String newEditScreens = screensRootFolder+"\\new_edit\\";
    private Pattern new_edit_hdr = new Pattern(newEditScreens+"new_edit_hdr.png");
    private Pattern freight_fld = new Pattern(newEditScreens+"freight_fld.png");
    public Pattern ok_btn2 = new Pattern(newEditScreens+"ok_btn2.png");

    public void waitNewEditWindow() throws FindFailed {
        screen.wait(new_edit_hdr,10.0);
    }

    public void selectFreight() throws FindFailed {
        var r = screen.find(freight_fld);
        screen.click(r.offset(110,0));

    }
    public void enterFreight(String freight){
        screen.type(freight);
    }

    public void selectVAT(){
        screen.type(Key.TAB);
        screen.type(Key.TAB);
        screen.type(Key.TAB);
    }

    public void enterVAT(){
        screen.type("U");
    }
    public void selectDateFrom(){
        screen.type(Key.TAB);
    }

    public String getCurrentDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
//        System.out.println(date);
        return date;
    }

    public String getTomorrowDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime tomorrow = now.plusDays(1);
        String date = dtf.format(tomorrow);
//        System.out.println(date);
        return date;
    }

    public void enterDate(String date){
        screen.type(date);
    }

    public void selectTillDate(){
        screen.type(Key.TAB);
    }

    public void selectAmountSp(){screen.type(Key.TAB);}

    public void enterAmountSp(String amountSp){
        screen.type(amountSp);
    }

    public void selectLoadingMeter(){
        screen.type(Key.TAB);
    }

    public void enterLoadingMeter(String loadingMeter){
        screen.type(loadingMeter);
    }

    public void selectPayload(){
        screen.type(Key.TAB);
    }

    public void enterPayload(){
        screen.type("A");
    }

    public void selectPriority(){
        screen.type(Key.TAB);
    }
    public void enterPriority(){
        screen.type("C");
    }

    public void selectSpSalesPerson(){
        screen.type(Key.TAB);
        screen.type(Key.TAB);
        screen.type(Key.TAB);
        screen.type(Key.TAB);
    }

    public void enterSpSalesPerson(){
        screen.type("A");
    }

    public void selectPpSalesPerson(){
        screen.type(Key.TAB);
    }

    public void enterPpSalesPerson(){
        screen.type("A");
    }

    public void selectTracker(){
        screen.type(Key.TAB);
    }

    public void enterTracker(){
        screen.type("A");
    }

    public void applyNewEditWindow() throws FindFailed {
//        var r = s.find(ok_btn2);
//        r.highlight(3);
        screen.click(ok_btn2);
    }

    public void competeNewEditWindow() throws FindFailed {
        selectFreight();
        enterFreight("test freight");
        selectVAT();
        enterVAT();
        selectDateFrom();
        enterDate(getCurrentDate());
        selectTillDate();
        enterDate(getTomorrowDate());
        selectAmountSp();
        enterAmountSp("123");
        selectLoadingMeter();
        enterLoadingMeter("13,3");
        selectPayload();
        enterPayload();
        selectPriority();
        enterPriority();
        selectSpSalesPerson();
        enterSpSalesPerson();
        selectPpSalesPerson();
        enterPpSalesPerson();
        selectTracker();
        enterTracker();
        applyNewEditWindow();
    }

//    public static void main(String[] args) throws FindFailed, InterruptedException {
//        NewEdit ne = new NewEdit(new Screen());
//        Thread.sleep(4000);
//
//        ne.waitNewEditWindow();
////        ne.selectFreight();
////        ne.enterFreight("test freight");
////        ne.selectVAT();
////        ne.enterVAT();
////        ne.selectDateFrom();
////        ne.enterDate(ne.getCurrentDate());
////        ne.selectTillDate();
////        ne.enterDate(ne.getTomorrowDate());
////        ne.selectAmountSp();
////        ne.enterAmountSp("123");
////        ne.selectLoadingMeter();
////        ne.enterLoadingMeter("13,3");
////        ne.selectPayload();
////        ne.enterPayload();
////        ne.selectPriority();
////        ne.enterPriority();
////        ne.selectSpSalesPerson();
////        ne.enterSpSalesPerson();
////        ne.selectPpSalesPerson();
////        ne.enterPpSalesPerson();
////        ne.selectTracker();
////        ne.enterTracker();
////        ne.applyNewEditWindow();
//
//        ne.competeNewEditWindow();
//
////        Screen s = new Screen();
////
////        var r = s.find(ne.ok_btn2).highlight(3);
//    }
}
