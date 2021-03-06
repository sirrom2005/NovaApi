package com.rohanmorris.nova.Model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "examination")
public class Examination {
    @Id
    private long id;
    private String name;
    private String exam_body;
    private String exam_answer;
    @OneToOne
    @JoinColumn(name = "exam_type")
    private ExaminationType exam_type;
    @OneToOne
    @JoinColumn(name = "duration")
    private ExaminationDuration duration;
    private int allow_retry;
    private String description;
    private String notes;
    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private long created_by;
    @JsonIgnore
    @Column(updatable = false)
    private String date_added;
    private String date_updated;
    private String exam_date;
    private String exam_expire_date;

    /**
    * 
    */
    public Examination() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateobj = new Date();
        setDate_added(df.format(dateobj));
        setDate_updated(df.format(dateobj));
    }

    /**
     * @param id
     * @param name
     * @param exam_type
     * @param duration
     * @param allow_retry
     * @param subject
     * @param date_updated
     */
    public Examination(long id, String name, ExaminationType exam_type, ExaminationDuration duration, int allow_retry,
            Subject subject, String date_updated) {
        this.id = id;
        this.name = name;
        this.exam_type = exam_type;
        this.duration = duration;
        this.allow_retry = allow_retry;
        this.subject = subject;
        this.date_updated = date_updated;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the exam_body
     */
    public String getExam_body() {
        return exam_body;
    }

    /**
     * @param exam_body the exam_body to set
     */
    public void setExam_body(String exam_body) {
        this.exam_body = exam_body;
    }

    /**
     * @return the exam_type
     */
    public ExaminationType getExam_type() {
        return exam_type;
    }

    /**
     * @param exam_type the exam_type to set
     */
    public void setExam_type(ExaminationType exam_type) {
        this.exam_type = exam_type;
    }

    /**
     * @return the duration
     */
    public ExaminationDuration getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(ExaminationDuration duration) {
        this.duration = duration;
    }

    /**
     * @return the allow_retry
     */
    public int getAllow_retry() {
        return allow_retry;
    }

    /**
     * @param allow_retry the allow_retry to set
     */
    public void setAllow_retry(int allow_retry) {
        this.allow_retry = allow_retry;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return the date_added
     */
    public String getDate_added() {
        return date_added;
    }

    /**
     * @param date_added the date_added to set
     */
    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    /**
     * @return the date_updated
     */
    public String getDate_updated() {
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        try {
            date = dt.parse(date_updated);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dt1 = new SimpleDateFormat("dd MMMM, yyyy 'at' h:mm:ss a");
        return dt1.format(date);
    }

    /**
     * @param date_updated the date_updated to set
     */
    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the subject
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * @return the exam_answer
     */
    public String getExam_answer() {
        return exam_answer;
    }

    /**
     * @param exam_answer the exam_answer to set
     */
    public void setExam_answer(String exam_answer) {
        this.exam_answer = exam_answer;
    }

    /**
     * @return the created_by
     */
    public long getCreated_by() {
        return created_by;
    }

    /**
     * @param created_by the created_by to set
     */
    public void setCreated_by(long created_by) {
        this.created_by = created_by;
    }

    /**
     * @return the exam_date
     */
    public String getExam_date() {
        return exam_date;
    }

    /**
     * @param exam_date the exam_date to set
     */
    public void setExam_date(String exam_date) {
        this.exam_date = exam_date;
    }

    /**
     * @return the exam_expire_date
     */
    public String getExam_expire_date() {
        return exam_expire_date;
    }

    /**
     * @param exam_expire_date the exam_expire_date to set
     */
    public void setExam_expire_date(String exam_expire_date) {
        this.exam_expire_date = exam_expire_date;
    }
}