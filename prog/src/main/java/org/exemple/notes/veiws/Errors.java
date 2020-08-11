package org.exemple.notes.veiws;

public class Errors {
    private static Errors ourInstance;

    private String errorPassRepass;

    public Errors () {
        PathHtml pathHtml = PathHtml.getInstance();
//        this.errorPassRepass = pathHtml.getPartialHtml("/error-pass-repass.html");
        this.errorPassRepass = pathHtml.getPartialHtml("/error-pass-repass.html");
       // this.errorPassRepass = pathHtml.getPartialHtml("/error-pass-repass.html");
    }


    public static Errors getInstance() {
        if (ourInstance == null) {
            ourInstance = new Errors();
        }
        return ourInstance;
    }

    public String getErrorPassRepass() {
        return errorPassRepass;
    }

    public void setErrorPassRepass(String errorPassRepass) {
        this.errorPassRepass = errorPassRepass;
    }
}
