package org.example.notes.views;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Клас використовується для відображення вмісту файлів з папки html.
 * Поля (змінні) типу String передають назви файлів з папки html.
 * Клас є Singleton.
 */
public class PathHtmlSingleton {
    /**
     * Використовується як шлях до папки html.
     */
    private String path = "";

    /**
     * Поля відповідають назвам файлів з папки html.
     */
    private String top;
    private String menu;
    private String bottom;

    /**
     * Реалізація патерну Singleton.
     */
    private static PathHtmlSingleton instance = new PathHtmlSingleton();

    private PathHtmlSingleton() {
    }

    public static PathHtmlSingleton getInstance() {
        return instance;
    }

    /**
     * Getters and Setters для приватних полів.
     */

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    /**
     * Метод, що буде реалізувати чзчитування інформації з файлів
     *
     * @param fileName назва файлу
     * @return String повертає вміст/або назву
     */
    private String getPartHtml(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        Path filePath = Path.of(this.path, fileName);
        Charset charset = Charset.forName("UTF-8");

        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath, charset)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        return stringBuilder.toString();
    }

}
