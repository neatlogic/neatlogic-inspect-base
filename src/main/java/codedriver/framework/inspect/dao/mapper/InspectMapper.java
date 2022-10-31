package codedriver.framework.inspect.dao.mapper;

import codedriver.framework.cmdb.dto.cientity.CiEntityInspectVo;
import codedriver.framework.inspect.dto.InspectAlertEverydayVo;
import codedriver.framework.inspect.dto.InspectResourceScriptVo;
import codedriver.framework.cmdb.dto.resourcecenter.ResourceSearchVo;
import codedriver.framework.inspect.dto.InspectCiCombopVo;
import codedriver.framework.inspect.dto.InspectResourceVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectMapper {
    List<InspectCiCombopVo> searchInspectCiCombopList();

    void replaceInspectCiCombopList(@Param("ciVoList") List<InspectCiCombopVo> ciVoList);

    Long getCombopIdByCiId(Long ciId);

    List<InspectResourceVo> getInspectResourceListByIdList(List<Long> idList);

    List<InspectResourceVo> getInspectResourceListByIdListAndJobId(@Param("idList") List<Long> idList, @Param("jobId") Long jobId);

    List<InspectResourceScriptVo> getResourceScriptListByResourceIdList(@Param("resourceIdList") List<Long> resourceIdList);

    InspectResourceScriptVo getResourceScriptByResourceId(Long resourceId);

    int getInspectResourceCount(ResourceSearchVo searchVo);

    int getInspectResourceCountByIpKeyword(ResourceSearchVo searchVo);

    int getInspectResourceCountByNameKeyword(ResourceSearchVo searchVo);

    List<Long> getInspectResourceIdList(ResourceSearchVo searchVo);

    int getInspectAutoexecJobNodeResourceCount(@Param("searchVo") ResourceSearchVo searchVo, @Param("jobId") Long jobId);

    int getInspectAutoexecJobNodeResourceCountByIpKeyword(@Param("searchVo") ResourceSearchVo searchVo, @Param("jobId") Long jobId);

    int getInspectAutoexecJobNodeResourceCountByNameKeyword(@Param("searchVo") ResourceSearchVo searchVo, @Param("jobId") Long jobId);

    List<Long> getInspectAutoexecJobNodeResourceIdList(@Param("searchVo") ResourceSearchVo searchVo, @Param("jobId") Long jobId);

    List<CiEntityInspectVo> getCiEntityInspectByJobIdAndCiEntityIdList(@Param("jobId") Long jobId, @Param("ciEntityIdList") List<Long> ciEntityIdList);

    int insertResourceScript(@Param("resourceId") Long resourceId, @Param("scriptId") Long scriptId, @Param("config") String config);

    int deleteResourceScriptByResourceId(Long resourceId);

    int insertInspectAlertEveryday(InspectAlertEverydayVo inspectAlertEverydayVo);
}
