package org.freeplane.plugin.multimedia;

import java.awt.event.ActionEvent;

import org.freeplane.core.ui.AFreeplaneAction;
import org.freeplane.core.ui.components.UITools;
import org.freeplane.features.mode.Controller;

public class MultimediaAction extends AFreeplaneAction {
	private static final long serialVersionUID = 1L;

	public MultimediaAction(Controller controller) {
		super("Multimedia", "Multimedia", null);
	}

	public void actionPerformed(final ActionEvent e) {
		/*TODO: enter your GUI code here*/
		UITools.informationMessage("Hi!\n\tThis is plugin Multimedia");
	}
}
