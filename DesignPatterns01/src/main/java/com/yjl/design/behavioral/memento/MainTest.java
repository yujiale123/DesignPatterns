package com.yjl.design.behavioral.memento;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/18
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Gamer gamer = new Gamer();
        gamer.playGame();

        gamer.saveGameRecord();

        gamer.playGame();

        gamer.saveGameRecord();

        Gamer fromMemento = gamer.getFromMemento(1);

        fromMemento.playGame();

    }
}
