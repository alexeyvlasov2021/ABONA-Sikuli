package screens;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Goods extends MainWindow{
    public Goods(Screen screen){
        super(screen);
    }

    private String goodsScreens = screensRootFolder+"\\goods\\";
    private Pattern goods_hdr = new Pattern(goodsScreens+"goods_hdr.png");
    private Pattern loadType_fld = new Pattern(goodsScreens+"goods_hdr.png").targetOffset(168, 39);
//            new Pattern(goodsScreens+"load_type_fld.png");
    private Pattern cargo_type = new Pattern(goodsScreens+"goods_hdr.png").targetOffset(199, 113);
    public Pattern quantity_fld = new Pattern(goodsScreens+"goods_hdr.png").targetOffset(160, 297);
//            new Pattern(goodsScreens+"quantity_fld.png");
    public Pattern ok_btn2 = new Pattern(goodsScreens+"ok_btn2.png");

    public void waitGoodsWindow() throws FindFailed {
        screen.wait(goods_hdr,10.0);
    }

    public void selectLoadType() throws FindFailed {
        screen.click(loadType_fld);
    }
    public void enterLoadType() throws FindFailed {
//        var r = s.find(loadType_fld);
//        r.highlight(3);
//        screen.click(loadType_fld.targetOffset(184,0));
//        screen.click(loadType_fld.targetOffset(150,80));
        screen.type("auto");
        screen.click(cargo_type);
    }

    public void selectProductNo(){
        screen.type(Key.TAB);
        screen.type(Key.TAB);
    }

    public void enterProductNo(String productNo){
        screen.type(productNo);
    }

    public void selectQuantity() throws FindFailed {
//        screen.doubleClick(quantity_fld.targetOffset(152,0));
        screen.doubleClick(quantity_fld);
    }

    public void enterQuantity(String quantity){
        screen.type(quantity);
    }

    public void applyGoodsWindow() throws FindFailed {
        screen.click(ok_btn2);
    }

    public void completeGoodsWindow() throws FindFailed {
        selectLoadType();
        enterLoadType();
        selectProductNo();
        enterProductNo("12345");
        selectQuantity();
        enterQuantity("1");
        applyGoodsWindow();
    }

//    public static void main(String[] args) throws FindFailed, InterruptedException {
//        Goods g = new Goods(new Screen());
//        Thread.sleep(4000);
//        g.waitGoodsWindow();
////        g.enterLoadType();
////        g.selectProductNo();
////        g.enterProductNo("12345");
////        g.selectQuantity();
////        g.enterQuantity("1");
////        g.applyGoodsWindow();
//        g.completeGoodsWindow();
//
//    }

}
