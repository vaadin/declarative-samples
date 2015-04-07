package com.vaadin.declarative.demo;

import com.vaadin.event.FieldEvents;

/**
 * Created by Vaadin Ltd / mjhosio on 07/04/15.
 */
public abstract class EditableSampleView extends SampleView{
	public EditableSampleView(String templateName) {
		super(templateName);
		// let's make the login form editable for demonstration purposes
		editor.setReadOnly(false);
		editor.addTextChangeListener(new FieldEvents.TextChangeListener() {
			@Override
			public void textChange(FieldEvents.TextChangeEvent textChangeEvent) {
				updateLayout();
			}
		});
	}

	protected abstract void updateLayout();
}
