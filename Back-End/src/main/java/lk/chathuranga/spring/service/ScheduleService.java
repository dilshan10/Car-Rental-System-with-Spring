package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.ScheduleDTO;

import java.util.ArrayList;

public interface ScheduleService {
    public void addSchedule(ScheduleDTO dto);

    public void updateSchedule(ScheduleDTO dto);

    public void deleteSchedule(String id);

    public ArrayList<ScheduleDTO> loadAllSchedule();
}
