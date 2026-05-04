package org.projectoutkast.outkastmc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OutkastMCClient implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "outkastmc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing OutkastMC mod");
		// TODO: Add common initialization logic here.
	}

	@Override
	public void onInitializeClient() {
		LOGGER.info("Initializing OutkastMC client");
		// TODO: Add client-only initialization logic here.
	}
}
