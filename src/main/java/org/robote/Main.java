package org.robote;

import ch.bailu.gtk.adw.Application;
import ch.bailu.gtk.adw.ApplicationWindow;
import ch.bailu.gtk.gio.ApplicationFlags;
import ch.bailu.gtk.type.Strs;

public class Main {
    public static void main(String[] args) {
        var app=new Application("com.robote.notes", ApplicationFlags.DEFAULT_FLAGS);

        app.onActivate(()->{
            //Create new Window
            var window = new ApplicationWindow(app);
            window.setTitle("Notes");


            window.show();
        });

        var result=app.run(args.length, new Strs(args));
        System.exit(result);
    }
}