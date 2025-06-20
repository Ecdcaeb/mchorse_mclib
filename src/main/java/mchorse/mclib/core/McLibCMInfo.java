package mchorse.mclib.core;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.DummyModContainer;

public class McLibCMInfo extends DummyModContainer
{
    public McLibCMInfo() {
        super(new ModMetadata());
        ModMetadata meta = this.getMetadata();
        meta.modId = "mclib_core";
        meta.name = "McLib core mod";
        meta.version = "%VERSION%";
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        return true;
    }
}
