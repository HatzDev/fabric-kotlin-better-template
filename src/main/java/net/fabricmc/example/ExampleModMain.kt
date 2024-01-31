package net.fabricmc.example

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleModMain: ModInitializer {
    companion object{
        const val MOD_ID: String = "modid"
        val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)
    }

    override fun onInitialize() {
        LOGGER.info("Hello Fabric world!")
    }
}