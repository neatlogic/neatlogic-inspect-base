package neatlogic.framework.inspect.dao.mapper;

import neatlogic.framework.inspect.dto.InspectAppSystemScheduleVo;
import neatlogic.framework.inspect.dto.InspectScheduleVo;

import java.util.List;

public interface InspectScheduleMapper {

    List<InspectScheduleVo> getInspectScheduleList();

    InspectScheduleVo getInspectScheduleById(Long id);

    InspectScheduleVo getInspectScheduleByUuid(String uuid);

    InspectAppSystemScheduleVo getInspectAppSystemScheduleById(Long id);

    List<InspectAppSystemScheduleVo> getInspectAppSystemScheduleListByAppSystemIdList(List<Long> appSystemIdList);

    int getInspectAppSystemScheduleCount(InspectAppSystemScheduleVo vo);

    List<InspectAppSystemScheduleVo> getInspectAppSystemScheduleList(InspectAppSystemScheduleVo vo);

    int updateInspectSchedule(InspectScheduleVo vo);

    int updateInspectScheduleStatus(InspectScheduleVo vo);

    int updateInspectAppSystemSchedule(InspectAppSystemScheduleVo vo);

    int updateInspectAppSystemScheduleStatus(InspectAppSystemScheduleVo vo);

    int insertInspectSchedule(InspectScheduleVo vo);

    int insertInspectAppSystemSchedule(InspectAppSystemScheduleVo vo);
}
