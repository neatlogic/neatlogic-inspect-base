package codedriver.framework.inspect.dao.mapper;

import codedriver.framework.cmdb.dto.resourcecenter.ResourceSearchVo;
import codedriver.framework.inspect.dto.InspectCiCombopVo;
import codedriver.framework.inspect.dto.InspectResourceVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectMapper {
    List<InspectCiCombopVo> searchInspectCiCombopList();

    void replaceInspectCiCombopList(@Param("ciVoList") List<InspectCiCombopVo> ciVoList);

    Long getCombopIdByCiId(Long ciId);

    List<InspectResourceVo> getInspectResourceVoListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getInspectResourceCount(ResourceSearchVo searchVo);

    List<Long> getInspectResourceIdList(ResourceSearchVo searchVo);
}
