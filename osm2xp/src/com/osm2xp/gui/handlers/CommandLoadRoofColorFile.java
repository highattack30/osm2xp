package com.osm2xp.gui.handlers;

import java.io.File;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

import com.osm2xp.utils.helpers.GuiOptionsHelper;
import com.osm2xp.utils.logging.Osm2xpLogger;

/**
 * CommandLoadRoofColorFile.
 * 
 * @author Benjamin Blanchet
 * 
 */
public class CommandLoadRoofColorFile implements IHandler {
	private static final String[] FILTER_NAMES = { "Text files (*.txt)" };
	private static final String[] FILTER_EXTS = { "*.txt" };

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		FileDialog dlg = new FileDialog(Display.getCurrent().getActiveShell(),
				SWT.OPEN);
		dlg.setFilterNames(FILTER_NAMES);
		dlg.setFilterExtensions(FILTER_EXTS);
		String fileName = dlg.open();
		if (fileName != null) {
			GuiOptionsHelper.setRoofColorFile(new File(fileName));
			Osm2xpLogger.info("Roofs color file loaded : " + fileName);
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
