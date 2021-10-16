package com.yjl.design.behavioral.state;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public interface TeamState {
    void playGame();

    TeamState next();
}
