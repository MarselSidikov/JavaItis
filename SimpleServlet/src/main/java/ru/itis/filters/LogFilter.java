package ru.itis.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LogFilter implements Filter {

    private String messageParam;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.messageParam = filterConfig.getInitParameter("message-param");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String name = servletRequest.getParameter("admin-name");
        String password = servletRequest.getParameter("admin-password");
        System.out.println(messageParam + " " + name + " " + password);
        if (name == null & password == null) {
            name = ((HttpServletRequest)servletRequest).getCookies()[0].getValue();
            password = ((HttpServletRequest)servletRequest).getCookies()[1].getValue();
        }

        if (name != null & password != null) {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }

    public void destroy() {

    }
}
