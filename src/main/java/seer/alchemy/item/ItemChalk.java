package seer.alchemy.item;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import seer.alchemy.Alchemy;

public final class ItemChalk extends Item {
    public static final String name = "chalk";
    public static final ResourceLocation registryName = new ResourceLocation( Alchemy.MOD_ID, name );
    
    public ItemChalk() {
        super( new Item.Properties().group( Alchemy.itemGroup ).maxStackSize( 1 ).maxDamage( 1000 ) );
    }
    
    
}
