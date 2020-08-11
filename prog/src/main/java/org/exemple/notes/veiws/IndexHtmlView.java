package org.exemple.notes.veiws;

/**
 * Містить частини HTML сторінок, що відповідають за формування початкової сторінки
 * Ці часткові HTML сторінки зчитуються із папка HTML  і тримаються у полях цього класу.
 * Клас реалізує шаблон Singleton із Lazy Loading
 */
public class IndexHtmlView {
    private static IndexHtmlView ourInstance;



    private final String topHtml;
    private final String bottomHtml;
    private final String startHtml;
    private final String startBtn1Html;
    private final String startBtn2Html;
    private final String loginForm;
    private final String registerForm;
    private final String logoutButton;
    private final String noteCreator;

    public static IndexHtmlView getInstance() {
        if (ourInstance == null) {
            ourInstance = new IndexHtmlView();
        }
        return ourInstance;
    }

    private IndexHtmlView() {
        PathHtml pathHtml = PathHtml.getInstance();

        this.topHtml = pathHtml.getPartialHtml("/top.html");
        this.loginForm = pathHtml.getPartialHtml("/start-login-form.html");
        this.registerForm = pathHtml.getPartialHtml("/start-register-form.html");
        this.logoutButton = pathHtml.getPartialHtml("/start-logout-button.html");
        this.bottomHtml = pathHtml.getPartialHtml("/bottom.html");
        this.noteCreator = pathHtml.getPartialHtml("/create-note.html");
        this.startHtml = pathHtml.getPartialHtml("/start-btn.html");
        this.startBtn1Html = pathHtml.getPartialHtml("/start-btn1.html");
        this.startBtn2Html = pathHtml.getPartialHtml("/start-btn2.html");


    }

    public String getStartHtml() { return startHtml; }

    public String getStartBtn1Html() {
        return startBtn1Html;
    }

    public String getStartBtn2Html() {
        return startBtn2Html;
    }

    public String getLoginForm() {
        return loginForm;
    }

    public String getRegisterForm() {
        return registerForm;
    }

    public String getTopHtml() {
        return topHtml;
    }

    public String getBottomHtml() {
        return bottomHtml;
    }

    public String getLogoutButton() {
        return logoutButton;
    }

    public String getNoteCreator() { return noteCreator; }
}
