package net.fabricmc.example;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleModClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello Fabric world!");
    }
}
