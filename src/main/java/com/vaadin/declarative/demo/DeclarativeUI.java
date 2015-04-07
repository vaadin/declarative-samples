package com.vaadin.declarative.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import javax.servlet.annotation.WebServlet;

/**
 * Main UI for the declarative samples.
 */
@Theme("mytheme")
@Widgetset("com.vaadin.declarative.demo.MyAppWidgetset")
public class DeclarativeUI extends UI {

    private HorizontalLayout naviButtons;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        layout.setSizeFull();
        setContent(layout);
        naviButtons=new HorizontalLayout();
        naviButtons.setSpacing(true);
        layout.addComponent(naviButtons);
        CssLayout viewArea=new CssLayout();
        viewArea.setSizeFull();
        layout.addComponent(viewArea);
        layout.setExpandRatio(viewArea, 1.0f);
        setNavigator(new Navigator(this, viewArea));
        // add views
        addView("Start", DemoView.class);
        addView("Basics", EditableView.class);
        addView("LoginForm", LoginViewWithListeners.class);
        addView("Options", OptionGroupView.class);
        addView("Grid", GridSampleView.class);
        addView("Spreadsheet", SpreadsheetView.class);
        addView("Nested", NestedDesignsView.class);
        // navigate to initial page
        getNavigator().navigateTo("Start");
    }

    private void addView(final String viewName, Class<? extends View> viewClass){
        getNavigator().addView(viewName, viewClass);
        naviButtons.addComponent(new Button(viewName, new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(viewName);
            }
        }));
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = DeclarativeUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
