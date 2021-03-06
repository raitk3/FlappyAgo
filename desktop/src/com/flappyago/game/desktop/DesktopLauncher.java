package com.flappyago.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.flappyago.game.FlappyAgo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = FlappyAgo.WIDTH;
		config.height = FlappyAgo.HEIGHT;
		config.title = FlappyAgo.TITLE;
		config.resizable = false;
		new LwjglApplication(new FlappyAgo(), config);
	}
}
