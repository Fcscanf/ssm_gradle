package com.fcant.interceptor;

import org.springframework.web.servlet.ModelAndView;
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
     * 事务前面拦截
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

    /**
     * This implementation is empty.
     * 事后拦截/在跳转到视图（jsp页面）之前把数据放进ModelAndView
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            modelAndView.addObject("key", "1234");
        }
    }
}
