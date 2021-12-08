package codedriver.framework.inspect.dao.mapper;

import codedriver.framework.inspect.dto.InspectScheduleVo;

import java.util.List;

public interface InspectScheduleMapper {

    List<InspectScheduleVo> getInspectScheduleList();

    InspectScheduleVo getInspectScheduleById(Long id);

    InspectScheduleVo getInspectScheduleByUuid(String uuid);

    int updateInspectSchedule(InspectScheduleVo vo);

    int updateInspectScheduleStatus(InspectScheduleVo vo);

    int insertInspectSchedule(InspectScheduleVo vo);


}
