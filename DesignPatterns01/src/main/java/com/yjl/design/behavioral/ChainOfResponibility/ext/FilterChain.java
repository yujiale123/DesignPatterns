package com.yjl.design.behavioral.ChainOfResponibility.ext;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/24
 * 维护filter链条
 */
public class FilterChain implements Filter {
    int cursor = 0;

    //filter链
    List<Filter> filtersChain = new ArrayList<>();
    My target;

    void addFilter(Filter filter) {
        filtersChain.add(filter);
    }


    public List<Filter> getFiltersChain() {
        return filtersChain;
    }

    public void setFiltersChain(List<Filter> filtersChain) {
        this.filtersChain = filtersChain;
    }

    public My getTarget() {
        return target;
    }

    public void setTarget(My target) {
        this.target = target;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //第一次执行第一个filter，一次往下
        if (cursor < filtersChain.size()){
            Filter filter = filtersChain.get(cursor);
            cursor++;
            //执行filter
            filter.doFilter(request, response, chain);
        }else {
            //filter执行完链，则执行目标方法
            target.hello();
        }

    }
}
