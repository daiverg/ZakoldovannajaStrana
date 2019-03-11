package magicworld.gamedata;

import magicworld.model.Monster;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 11.03.2019.
 */
public class GameData {
    public static Map<MagicAttackType, Float> magicAttackTypeMap = new HashMap<MagicAttackType, Float>();
    static {
        //magicAttackTypeMap.put("stone", 2.5f);
        magicAttackTypeMap.put(MagicAttackType.STONE, 2.5f);
    }

    public static Float getDamageFactor(MagicAttackType key){
        return magicAttackTypeMap.get(key);
    }

}
