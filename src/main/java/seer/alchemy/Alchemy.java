package seer.alchemy;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Alchemy.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Alchemy {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "alchemy";
    // public static final ItemGroup ALCHEMY_ITEM_GROUP = new ItemGroupAlchemy();
    
    public Alchemy() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener( this::commonSetup );
        FMLJavaModLoadingContext.get().getModEventBus().addListener( this::clientSetup );
        FMLJavaModLoadingContext.get().getModEventBus().addListener( this::serverSetup );
        FMLJavaModLoadingContext.get().getModEventBus().addListener( this::enqueueIMC );
        FMLJavaModLoadingContext.get().getModEventBus().addListener( this::processIMC );
    }
    
    // Create the ItemGroup Class
    public static final ItemGroup itemGroup = new ItemGroup(Alchemy.MOD_ID) {
    
        @Override
        public ItemStack createIcon() {
            return null;
        }
    };
    
    private void commonSetup( final FMLCommonSetupEvent e ) {
        //preinit code
        LOGGER.info( "Setting Up Alchemy..." );
    }
    
    private void clientSetup( final FMLClientSetupEvent e ) {
    
    }
    
    private void serverSetup( final FMLDedicatedServerSetupEvent e ) {
    
    }
    
    private void enqueueIMC( final InterModEnqueueEvent e ) {
        //send to mods
    }
    
    private void processIMC( final InterModProcessEvent e ) {
        //get from mods
    }
    
    @SubscribeEvent
    public void onServerStarting( FMLServerStartingEvent e ) {
    
    }
}
