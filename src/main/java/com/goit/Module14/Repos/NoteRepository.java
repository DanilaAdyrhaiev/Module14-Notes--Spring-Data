package com.goit.Module14.Repos;

import com.goit.Module14.entities.Note;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface NoteRepository extends CrudRepository<Note, Long> {

}
