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
        Note showNote=null;
        for (int i=0;i<notesArrayList.size();i++){
            showNote=notesArrayList.get(i);
            System.out.println(showNote.getTitle());
            System.out.println(showNote.getContent());
            System.out.println(showNote.isActive());
        }
    }

    public void DeleteNote(){

    }
}
