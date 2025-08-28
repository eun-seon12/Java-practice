package com.ogiraffers.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/first/*")
public class FirstFilter implements Filter {

    public FirstFilter() {

        System.out.println("FirstFilter 인스턴스 생성!");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("Filter init 호출");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("Filter doFilter 호출");


        chain.doFilter(request, response);


        System.out.println("servlet 요청 수행 완료!");
    }
    
    @Override
    public void destroy() {

        System.out.println("Filter destroy 호출");
    }
}
