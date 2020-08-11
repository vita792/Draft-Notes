package org.exemple.notes.controllers;

import org.exemple.notes.entity.User;
import org.exemple.notes.veiws.IndexHtmlView;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "filterPages", value = {"/*", "/note/*"})
//check user log or not
public class Filter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;//casting
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;//casting
//        httpServletResponse.setContentType("text/html;charset=UTF-8");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
//        servletResponse.setContentType("text/html;charset=UTF-8");
//        String top = IndexHtmlView.getInstance().getTopHtml();
//        PrintWriter printWriter = servletResponse.getWriter();
//        printWriter.write(top);
//        String bottom = IndexHtmlView.getInstance().getTopHtml();
//        if(User.equals()){
//
//        }
//// if user is loggin then + btn"log out"

//        printWriter.write(bottom);

    }

    @Override
    public void destroy() {

    }


}
