package ru.kpfu.itis.group501.game;

import org.springframework.stereotype.Component;

/**
 * Created by ma on 02.03.2017.
 */

public class EnemyCreator {
    public Enemy getNewEnemy() {
        return new Enemy();
    }
}
