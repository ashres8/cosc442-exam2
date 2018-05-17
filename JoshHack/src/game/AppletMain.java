package game;

import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import asciiPanel.AsciiPanel;
import ui.Screen;
import ui.StartScreen;

// TODO: Auto-generated Javadoc
/**
 * The Class AppletMain.
 */
public class AppletMain extends Applet implements KeyListener {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2560255315130084198L;
	
	/** The terminal. */
	private AsciiPanel terminal;
	
	/** The screen. */
	private Screen screen;
	
	/**
	 * Instantiates a new applet main.
	 */
	public AppletMain(){
		super();
		terminal = new AsciiPanel();
		add(terminal);
		screen = new StartScreen();
		addKeyListener(this);
		repaint();
	}
	
	/* (non-Javadoc)
	 * @see java.applet.Applet#init()
	 */
	@Override
	public void init(){
		super.init();
		this.setSize(terminal.getWidth() + 20, terminal.getHeight() + 20);
	}

	/* (non-Javadoc)
	 * @see java.awt.Component#repaint()
	 */
	@Override
	public void repaint(){
		terminal.clear();
		screen.displayOutput(terminal);
		super.repaint();
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		screen = screen.respondToUserInput(e);
		repaint();
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) { }

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) { }
}
