package com.fcant.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * LoginInterceptor
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:07 2019-06-18/0018
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    /**
     * This implementation always returns {@code true}.
     *
     * @param request
     * @param response
     * @param handler
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName || "".equals(userName)) {
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
            return false;
        }
        return true;
    }
}
