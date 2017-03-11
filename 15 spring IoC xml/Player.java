package ru.kpfu.itis.group501.game;
public class Player {
    private String name;
    public Player() {}
    public Player(String name) { setName(name); }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
