package com.davidshuochou.dropwizardexample.dao;

import java.util.Date;

import com.davidshuochou.dropwizardexample.orm.Monster;

public class MonsterDao {

    public Monster getMonster() {
        Monster monster = new Monster();
        monster.id = new Long(1L);
        monster.name = "new-monster";
        monster.limbCount = new Integer(12);
        monster.birthday = new Date();
        return monster;
    }

}
