package com.example.esInterceptor1.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LegacyIntercepotr implements HandlerInterceptor {

     public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
             throws Exception {

         if (request.getRequestURL().toString().contains("/legacy")) {
             response.setStatus(410);
             return false;
         }
         return true;
    }

     public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

     public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
