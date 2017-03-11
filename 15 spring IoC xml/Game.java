package ru.kpfu.itis.group501.game;

import org.springframework.beans.factory.annotation.Autowired;

public class Game {
    private Player player;
    public void setEnemyCreator(EnemyCreator enemyCreator) {
        this.enemyCreator = enemyCreator;
    }

    private EnemyCreator enemyCreator;
    /*
    public void setEnemy1(Enemy enemy1) {
        this.enemy1 = enemy1;
    }
    public void setEnemy2(Enemy enemy2) {
        this.enemy2 = enemy2;
    }
    private Enemy enemy1;
    private Enemy enemy2;
    */

    private boolean isActive;


    public Game(Player player) {
        this.player = player;
    }

    public void init() {
        isActive = true;
        System.out.println("Game is ready to start.");
    }

    public void start() {
        System.out.println("Game started");
        System.out.println("Player " + player.getName() + " is ready.");
        enemyCreator.getNewEnemy();
        enemyCreator.getNewEnemy();
        //System.out.println(enemy1 == enemy2);
    }
}
