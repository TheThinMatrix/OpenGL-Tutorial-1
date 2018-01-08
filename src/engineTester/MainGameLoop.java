package engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;

/**
 * This class contains the main method and is used to test the engine.
 * 
 * @author Karl
 *
 */
public class MainGameLoop {

	/**
	 * Creates a display and then continuously updates the display until the user tries to close it. 
	 * @param args
	 */
	public static void main(String[] args) {
		DisplayManager.createDisplay();

		while (!Display.isCloseRequested()) {

			// game logic
			// render geometry
			DisplayManager.updateDisplay();
		}

		DisplayManager.closeDisplay();
	}

}
