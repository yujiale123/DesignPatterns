package com.yjl.design.behavioral.ChainOfResponibility.ext;



/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/24
 */
public interface Filter {
    /**
     * 指责链
     * @param request
     * @param response
     * @param chain
     */
   void  doFilter(Request request, Response response,FilterChain chain);
}
