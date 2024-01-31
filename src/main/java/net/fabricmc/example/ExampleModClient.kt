package net.fabricmc.example

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.example.ExampleModMain.Companion.MOD_ID
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleModClient: ClientModInitializer {
    companion object{
        val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)
    }

    override fun onInitializeClient() {
        LOGGER.info("Hello Fabric world!")
    }
}