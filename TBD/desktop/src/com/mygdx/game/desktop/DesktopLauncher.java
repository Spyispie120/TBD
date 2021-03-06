package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.TBDGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "TBD";
		config.width = 1280;
		config.height = 720;
		config.resizable = false;
		// config.fullscreen = true;

		// config.vSyncEnabled = false; // Setting to false disables vertical
		// sync
		// config.foregroundFPS = 0; // Setting to 0 disables foreground fps
		// throttling
		// config.backgroundFPS = 0; // Setting to 0 disables background fps
		// throttling
		new LwjglApplication(new TBDGame(), config);
	}
}
