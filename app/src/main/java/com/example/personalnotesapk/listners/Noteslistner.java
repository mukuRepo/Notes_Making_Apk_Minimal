package com.example.personalnotesapk.listners;

import com.example.personalnotesapk.entities.Note;

public interface Noteslistner {
    void onNoteClicked(Note note, int position);
}
