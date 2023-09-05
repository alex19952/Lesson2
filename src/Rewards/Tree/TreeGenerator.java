package Rewards.Tree;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class TreeGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new TreeRewards();
    }
}
