package Rewards.Clay;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class ClayGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new ClayRewards();
    }
}
