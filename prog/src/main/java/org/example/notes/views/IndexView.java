package org.example.notes.views;

import java.io.PrintWriter;

/**
 * Клас збирає всі частини html сторінки.
 */
public class IndexView {

    private PathHtmlSingleton pathHtmlSingleton;

    public IndexView() {
        pathHtmlSingleton = PathHtmlSingleton.getInstance();
    }

    public void getTopPage(PrintWriter printWriter) {
        printWriter.println(pathHtmlSingleton.getTop());
    }

    public void getMenuPage(PrintWriter printWriter) {
        printWriter.println();
    }

    public void getBottomPage(PrintWriter printWriter) {
        printWriter.println(pathHtmlSingleton.getBottom());
    }
}

