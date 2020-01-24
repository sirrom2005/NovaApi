package com.rohanmorris.nova.Interface;

import java.util.List;
import com.rohanmorris.nova.Model.School;

/**
 * ISchool
 */
public interface ISchool {
    /**
     * Create new School object
     * 
     * @param student
     * @return
     */
    public int create(School student);

    /**
     * Return a list of School object
     * 
     * @return
     */
    public List<School> read();

    /**
     * Update School object
     * 
     * @param id
     * @param school
     * @return
     */
    public School update(int id, School school);

    /**
     * Delete School object
     * 
     * @param id
     * @return
     */
    public int delete(int id);

    /**
     * Find School by id
     * 
     * @param id
     * @return
     */
    public School findById(int id);
}