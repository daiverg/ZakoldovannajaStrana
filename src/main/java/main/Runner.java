package main;

import magicworld.generator.MonsterFactory;
import magicworld.model.Monster;

/**
 * Created by User on 25.03.2019.
 */
public class Runner {

    public static void main(String[] args){
        MonsterFactory monsterFactory = new MonsterFactory();

        Monster m1 = MonsterFactory.sampleMonsters.get(1);

        System.out.println("Monster initial = "+m1);

        m1.setHealth(0.0f);

        System.out.println("Monster changed = "+m1);

        Monster m2 = MonsterFactory.sampleMonsters.get(1);

        System.out.println("New monster from factory= "+m2);

    }
}
