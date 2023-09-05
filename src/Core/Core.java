package Core;

import Abstractions.ItemGenerator;
import Rewards.Clay.ClayGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;
import Rewards.Tree.TreeGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        for(int i = 0; i < 20; i++) generatorList.add(new TreeGenerator());
        for(int i = 0; i < 25; i++) generatorList.add(new ClayGenerator());
        for(int i = 0; i < 4; i++) generatorList.add(new SilverGenerator());
        int random = ThreadLocalRandom.current().nextInt(0, 49);
        ItemGenerator myGenerator = generatorList.get(random);
        System.out.println(myGenerator.openReward());
    }
}
