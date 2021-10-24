package com.yjl.design.behavioral.ChainOfResponibility.ext;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/24
 */
public class HttpFilter implements  Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.msg+=">>>>";
        System.out.println("HttpFilter 之前");
        chain.doFilter(request,response,chain);
        System.out.println("HttpFilter 之后");
    }
}
