package com.yjl.design.behavioral.ChainOfResponibility.ext;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/24
 */
public class Response {
    String content;

    public Response(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
