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
    private final String loginForm;
    private final String registerForm;
    private final String logoutButton;

    public static IndexHtmlView getInstance() {
        if (ourInstance == null) {
            ourInstance = new IndexHtmlView();
        }
        return ourInstance;
    }

    private IndexHtmlView() {
        PathHtml pathHtml = PathHtml.getInstance();

        this.topHtml = pathHtml.getPartialHtml("top.html");
        this.loginForm = pathHtml.getPartialHtml("start-login-form.html");
        this.registerForm = pathHtml.getPartialHtml("start-register-form.html");
        this.logoutButton = pathHtml.getPartialHtml("start-logout-button.html");
        this.bottomHtml = pathHtml.getPartialHtml("bottom.html");

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
}
