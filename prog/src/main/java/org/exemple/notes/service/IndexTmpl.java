package org.exemple.notes.service;

import org.exemple.notes.veiws.IndexHtmlView;

import java.io.PrintWriter;

public class IndexTmpl {
    private PrintWriter printWriter;

    public IndexTmpl(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    public void showStart() {
        if (printWriter != null) {
            printWriter.println(IndexHtmlView.getInstance().getTopHtml());
            printWriter.println(IndexHtmlView.getInstance().getStartHtml());
            printWriter.println(IndexHtmlView.getInstance().getStartBtn1Html());
            printWriter.println(IndexHtmlView.getInstance().getStartBtn2Html());
            printWriter.println(IndexHtmlView.getInstance().getBottomHtml());
        }
    }


    //method view register form
    public void showRegisterForm() {
        if (printWriter != null) {
            printWriter.println(IndexHtmlView.getInstance().getTopHtml());
            printWriter.println(IndexHtmlView.getInstance().getRegisterForm());
            printWriter.println(IndexHtmlView.getInstance().getBottomHtml());
        }
    }

    //method view loginform
    public void showLoginForm() {
        if (printWriter != null) {
            printWriter.println(IndexHtmlView.getInstance().getTopHtml());
            printWriter.println(IndexHtmlView.getInstance().getLoginForm());
            printWriter.println(IndexHtmlView.getInstance().getBottomHtml());
        }
    }

    //method create note
    public void createNote() {
        if (printWriter != null) {
            printWriter.println(IndexHtmlView.getInstance().getTopHtml());
            printWriter.println(IndexHtmlView.getInstance().getNoteCreator());
            printWriter.println(IndexHtmlView.getInstance().getBottomHtml());
        }
    }


}
