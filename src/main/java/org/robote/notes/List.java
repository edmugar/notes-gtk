package org.robote.notes;

import org.robote.notes.dto.Note;

import java.util.ArrayList;

public class List {
    ArrayList<Note> notesArrayList = new ArrayList<>();

    public void NewNote(Note note){
       Note newNote=new Note();
       newNote.setTitle(note.getTitle());
       newNote.setContent(note.getContent());
       newNote.setActive(note.isActive());

       notesArrayList.add(newNote);
    }

    public void ShowNote(){
        System.out.println(notesArrayList.get(0));
    }

    public void DeleteNote(){

    }
}
