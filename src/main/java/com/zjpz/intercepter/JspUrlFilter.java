package com.zjpz.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JSP页面过滤，自动跳转到首页
 *
 * @author wenchao.L
 * @version 1.0
 * @date 2016/4/8 17:43
 */
public class JspUrlFilter implements Filter {
    protected static final Logger LOG = LoggerFactory.getLogger(JspUrlFilter.class);
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
        String uri = httpServletRequest.getRequestURI();
        if(uri.indexOf(".jsp") > -1 || uri.equals("/")){   //过滤JSP页面
            httpServletResponse.sendRedirect("/index.html");
            return;
        }

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
