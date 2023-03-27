//<<<<<<< HEAD
////package com.musicat.config;
////
////import org.springframework.core.Ordered;
////import org.springframework.core.annotation.Order;
////import org.springframework.stereotype.Component;
////
////import javax.servlet.Filter;
////import javax.servlet.FilterChain;
////import javax.servlet.FilterConfig;
////import javax.servlet.ServletException;
////import javax.servlet.ServletRequest;
////import javax.servlet.ServletResponse;
////import javax.servlet.http.HttpServletRequest;
////import javax.servlet.http.HttpServletResponse;
////import java.io.IOException;
////
////@Component
////@Order(Ordered.HIGHEST_PRECEDENCE)
////public class CorsFilter implements Filter {
////
////    @Override
////    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
////        HttpServletResponse response = (HttpServletResponse) res;
////        HttpServletRequest request = (HttpServletRequest) req;
////        response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");
////        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, HEAD");
////        response.setHeader("Access-Control-Allow-Headers", "*");
////        response.setHeader("Access-Control-Allow-Credentials", "true");
////        response.setHeader("Access-Control-Max-Age", "3600");
////
////        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
////            response.setStatus(HttpServletResponse.SC_OK);
////        } else {
////            chain.doFilter(req, res);
////        }
////    }
////
////    @Override
////    public void init(FilterConfig filterConfig) {
////    }
////
////    @Override
////    public void destroy() {
////    }
////}
//=======
//package com.musicat.config;
//
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class CorsFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//        HttpServletResponse response = (HttpServletResponse) res;
//        HttpServletRequest request = (HttpServletRequest) req;
////        response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500, http://localhost:5173, https://musicat.kr");
//        response.setHeader("Access-Control-Allow-Origin","*");
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, PATCH, HEAD");
//        response.setHeader("Access-Control-Allow-Headers", "*");
////        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("Access-Control-Max-Age", "3600");
//
//        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
//            response.setStatus(HttpServletResponse.SC_OK);
//        } else {
//            chain.doFilter(req, res);
//        }
//    }
//    //
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//    }
//
//    @Override
//    public void destroy() {
//    }
//}
//>>>>>>> 842eed2f45ed6aa05faf691cee6484f694ca6527