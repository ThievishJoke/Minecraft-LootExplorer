package net.vg.lootexplorer;

import net.fabricmc.api.ClientModInitializer;
import net.vg.lootexplorer.item.ModItemGroups;

public class LootExplorerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemGroups.registerItemGroups();
    }
}