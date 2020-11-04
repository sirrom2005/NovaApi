package com.rohanmorris.nova.Repo;
import com.rohanmorris.nova.Model.UpcomingExam;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUpcomingExamsRepo extends CrudRepository<UpcomingExam, Long>
{
    @Query(value = "call get_upcoming_exams(?1)", nativeQuery = true) 
    public Iterable<UpcomingExam> getUpcomingExams(long studentId);
}
