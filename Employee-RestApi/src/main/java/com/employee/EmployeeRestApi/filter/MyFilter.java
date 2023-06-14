package com.employee.EmployeeRestApi.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Iterator;

@Component
@Order(1)
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest=(HttpServletRequest) request;
        HttpServletResponse httpServletResponse=(HttpServletResponse) response;
//        Iterator<String> values=httpServletRequest.getHeaderNames().asIterator();
//        values.forEachRemaining(i->{
//            System.out.println(i+httpServletRequest.getHeader(i));
//        });
       httpServletRequest.setAttribute("name","rakesh reddy");
        chain.doFilter(httpServletRequest,httpServletResponse);


    }
}
