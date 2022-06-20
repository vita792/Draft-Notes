package org.example.notes;

public class PageParts {
    public static final String PAGE_HEADER = """
            <!DOCTYPE html>
            <html lang="utf-8">
            <head>
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" context="width=device-width, initial=scale=1">
            <title>Servlet Application</title>
            <link rel="stylesheet" href="css/bootstrap.min.css">
            <link rel="stylesheet" href="css/style.css">
            </head>
            <body>
            """;

    public static final String MENU_BAR = """
            <nav class="navbar navbar-inverse navbar-fixed-top"> 
            <div class="container"
            <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="navbar" area-expand="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">DraftNotes</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
            <li class="dropdown">
            <a href="#" class="dropdown-toggle" dat-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"></a>
            <ul class="dropdown-menu">
            <li><a href="/note/add">ADD</a></li>
            <li><a href="/note/show">SHOW</a></li>
            <li><a href="/note/info">INFO</a></li>
            </ul>
            </li>
            </ul>
            </div><!--/.nav-collapse -->
            </div>
            </nav>
            """;

    public static final String PAGE_FOOTER = """
            </div>
            <script src="js/jquery.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
            </body>
            </html>
            """;

    public static String getTag(String tag, String contx, String attributes) {
        attributes = attributes.length() > 0 ? " " + attributes : "";
        return "<" + tag + attributes + " >" + contx + "</" + tag + ">";
    }

    public static String getColumns(String[][] contx) {
        String tag = """
                <div class="row">
                """;
        for (String[] item : contx) {
            tag += "\t<div class=\"" + item[1] + "\">\n\t\t" + item[0] + "\nt</div>\n";
        }
        tag += "</div> <!-- end row -->\n";
        return tag;
    }
}
