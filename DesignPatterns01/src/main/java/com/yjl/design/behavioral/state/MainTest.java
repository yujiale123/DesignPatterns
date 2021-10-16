package com.yjl.design.behavioral.state;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class MainTest {
    public static void main(String[] args) {
        Team team = new Team();
        VocationState vocationState = new VocationState();
        team.setTeamState(vocationState);
        team.startGame();


        team.nextState();
        team.startGame();
        team.startGame();
    }
}
