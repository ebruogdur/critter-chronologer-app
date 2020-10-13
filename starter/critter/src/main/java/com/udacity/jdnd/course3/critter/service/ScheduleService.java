package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.model.Schedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScheduleService {

    Schedule saveSchedule(Schedule schedule);

    List<Schedule> getAllSchedules();

    List<Schedule> getSchedulesForPet(long petId);

    List<Schedule> getScheduleForEmployee(long employeeId);

    List<Schedule> getScheduleForCustomer(long customerId);
}
