package com.yjl.design.behavioral.memento;

import org.apache.commons.beanutils.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/18
 * <p>
 * 管理者
 */
public class GameServer {

    /**
     * 管理备忘录信息
     */
    Map<Integer, GameRecord> records = new HashMap<>();
    Integer i = 1;

    void add(GameRecord gameRecord) {
        gameRecord.setId(i++);
        records.put(gameRecord.id, gameRecord);
    }

    Gamer getGameRecord(Integer id) throws Exception {
        GameRecord gameRecord = records.get(id);
        //获取到备忘录里面内容以后还要逆转
        Gamer gamer = new Gamer();
        BeanUtils.copyProperties(gamer, gameRecord);
        return gamer;
    }

}
