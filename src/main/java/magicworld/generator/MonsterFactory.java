package magicworld.generator;
import magicworld.model.Monster;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 11.03.2019.
 */
public class MonsterFactory {
    public static Map<Integer, Monster> sampleMonsters = new HashMap<>();

    static {
        sampleMonsters.put(1, (new Monster("Лев",
                9, 2.0f, 10, 0.5f, 25,
                1, 0, null, 0.0f) {}));

        sampleMonsters.put(2, (new Monster("Оборотень 20",
                5, 3.0f, 10, 0.5f, 65,
                1, 0, null, 0.0f) {}));
        sampleMonsters.put(3, (new Monster("Оборотень 19",
                6, 2, 9, 0.5f, 45,
                1, 0, null, 0.0f) {}));
        sampleMonsters.put(4, (new Monster("Оборотень 17",
                8, 2, 8, 0.5f, 30,
                1, 0, null, 0.0f) {}));
        sampleMonsters.put(5, (new Monster("Оборотень 18",
                7, 2, 8, 0.5f, 35,
                1, 0, null, 0.0f) {}));
        sampleMonsters.put(6, (new Monster("Морской змей",
                11, 1, 9, 0.5f, 15,
                1, 0, null, 0.0f) {}));

    }
}
