package seer.alchemy.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static Item itemChalk;
    
    public static void register( IForgeRegistry<Item> registry ) {
        registry.registerAll(
                itemChalk = new ItemChalk().setRegistryName( ItemChalk.registryName )
        );
    }
}
