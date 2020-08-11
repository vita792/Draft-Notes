package org.exemple.notes.controllers;

import org.exemple.notes.veiws.IndexHtmlView;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "filterPages", value = {"/*", "/note/*"})
    //check user log or not
public class ServletFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;//casting
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;//casting
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        String header = IndexHtmlView.getInstance().getTopHtml();
        String footer = IndexHtmlView.getInstance().getBottomHtml();
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.write(header);
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        printWriter.write(footer);

    }

    @Override
    public void destroy() {

    }


}
