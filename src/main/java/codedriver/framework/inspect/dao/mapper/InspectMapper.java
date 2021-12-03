package codedriver.framework.inspect.dao.mapper;

import codedriver.framework.cmdb.dto.ci.CiVo;

import java.util.List;

public interface InspectMapper {
    List<CiVo> searchInspectCiCombopList();

    Long getCombopIdByCiId(Long ciId);

    void insertInspectCiCombopList(List<CiVo> ciVoList);


}
