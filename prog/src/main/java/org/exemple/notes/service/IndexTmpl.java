package org.exemple.notes.service;

import org.exemple.notes.veiws.IndexHtmlView;

import java.io.PrintWriter;

public class IndexTmpl {
    private PrintWriter printWriter;

    public IndexTmpl(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }
    public void showRegisterForm(){
        if (printWriter != null){

            printWriter.println(IndexHtmlView.getInstance().getRegisterForm());
        }
    }

    //method view loginform
    public void showLoginForm(){
        if (printWriter != null){
            printWriter.println(IndexHtmlView.getInstance().getTopHtml());
            printWriter.println(IndexHtmlView.getInstance().getLoginForm());
            printWriter.println(IndexHtmlView.getInstance().getBottomHtml());
        }
    }
}
