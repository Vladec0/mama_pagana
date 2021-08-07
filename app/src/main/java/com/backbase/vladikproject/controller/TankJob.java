package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.Armor;
import com.backbase.vladikproject.model.Canon;
import com.backbase.vladikproject.model.Country;
import com.backbase.vladikproject.model.Tank;
public class TankJob {

    public void execute() {

        // Tank tank = new Tank()
        Canon canon0 = new Canon(
                0,
                " kampf GUN",
                true,
                280,
                88
        );

        Canon canon1 = new Canon(
                1,
                "Sherman M50",
                false,
                110,
                50
        );

        Canon canon2 = new Canon(
                2,
                "Cherhuil VI",
                true,
                150,
                60
        );
        Canon canon3 = new Canon(
                3,
                "Ваз 21 15",
                true,
                75,
                50

        );
        Armor armor0 = new Armor(
                0,
                "Germany armor",
                1207540,
                true
        );
        Armor armor1 = new Armor(
                1,
                "America armor",
                705035,
                false
        );
        Armor armor2 = new Armor(
                2,
                "Britain armor",
                1007040,
                true
        );
        Armor armor3 = new Armor(
                3,
                "Russian armor",
                704530,
                false
        );


        Tank tank0 = new Tank(
                0,
                "Panzer KampfWagen VI Tiger 1",
                canon0,
                armor0,
                1100,
                Country.GERMANY

        );
        Tank tank1 = new Tank(
                1,
                "Sherman III",
                canon1,
                armor1,
                560,
                Country.AMERICA
        );
        Tank tank2 = new Tank(
                2,
                "Cherchuil VI",
                canon2,
                armor2,
                1080,
                Country.BRITAIN
        );
        Tank tank3 = new Tank(
                3,
                "t - 34 lox",
                canon3,
                armor3,
                430,
                Country.RUSSIAN
        );
    }
}

