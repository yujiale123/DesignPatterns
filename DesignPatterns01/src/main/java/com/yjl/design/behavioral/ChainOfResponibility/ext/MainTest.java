package com.yjl.design.behavioral.ChainOfResponibility.ext;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/24
 */
public class MainTest {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        HttpFilter httpFilter = new HttpFilter();
        CharacterFilter characterFilter = new CharacterFilter();
        EncodingFilter encodingFilter = new EncodingFilter();

        filterChain.addFilter(httpFilter);
        filterChain.addFilter(characterFilter);
        filterChain.addFilter(encodingFilter);
        filterChain.setTarget(new My());

        /**
         * filter如何链式执行
         */
        filterChain.doFilter(new Request("hello,wolrd"),
                new Response("sad会撒谎的"),
                filterChain);
    }
}
