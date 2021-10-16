package com.yjl.design.behavioral.strategy;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class MainTest {
    public static void main(String[] args) {

        Team team = new Team();
        team.setGameStrategy(new GoStrategy());
        team.startGame();

        team.setGameStrategy(new RandomStrategy());
        team.startGame();
    }
}
