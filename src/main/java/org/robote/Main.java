package org.robote;

import ch.bailu.gtk.adw.Application;
import ch.bailu.gtk.adw.ApplicationWindow;
import ch.bailu.gtk.gio.ApplicationFlags;
import ch.bailu.gtk.type.Strs;
import org.robote.notes.List;
import org.robote.notes.dto.Note;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        Scanner in = new Scanner(System.in);
        Note newNote = new Note();
        System.out.println("Ingrese el número de notas a agregar: ");
        int loop_number = in.nextInt();
        
        for (int i = 0; i < loop_number; i++) {
            System.out.println("Ingrese el Titulo de la nota:");
            newNote.setTitle(in.nextLine());
            System.out.println("Ingrese el contenido de la nota:");
            newNote.setContent(in.nextLine());
            System.out.println("----------------------------------");
            list.NewNote(newNote);
        }

        list.ShowNote();
    }
}