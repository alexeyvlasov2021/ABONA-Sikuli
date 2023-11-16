package screens;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class NewDocument extends MainWindow{
    public NewDocument(Screen screen){
        super(screen);
    }

    private String newDocumentScreens = screensRootFolder+"\\new_document\\";

    private Pattern new_document_hdr = new Pattern(newDocumentScreens+"new_document_hdr.png");
    private Pattern purchase_fld = new Pattern(newDocumentScreens+"new_document_hdr.png").targetOffset(82, 113);

    private Pattern ok_btn = new Pattern(newDocumentScreens+"ok_btn.png");
//            new Pattern(newDocumentScreens+"new_document_hdr.png").targetOffset(520, 374);


    public void waitNewDocumentForm() throws FindFailed, InterruptedException {
        Thread.sleep(3000);
        screen.wait(new_document_hdr,30.0);
    }

    public void selectPurchaseFild() throws FindFailed {
//        var rr = s.find(new_document_hdr);
//        rr.highlight(3,"blue");
//        var r = s.find(purchase_fld);
//        r.highlight(3);
        screen.click(purchase_fld);
    }

    public void enterPurchase(){
        screen.type("some text");
    }
    public void applyNewDocumentWindow() throws FindFailed {
//        s.wait(new_document_hdr, 10.0);
        screen.click(ok_btn);
    }

    public void completeNewDocumentWindow() throws FindFailed {
        selectPurchaseFild();
        enterPurchase();
        applyNewDocumentWindow();
    }

//    public static void main(String[] args) throws FindFailed, InterruptedException {
//        NewDocument nd = new NewDocument(new Screen());
//        Thread.sleep(4000);
////        nd.waitNewDocumentForm();
////        nd.selectPurchaseFild();
////        nd.enterPurchase();
////        nd.applyNewDocumentWindow();
//        nd.completeNewDocumentWindow();
//
//    }
}
