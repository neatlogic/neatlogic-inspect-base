package codedriver.framework.inspect.dao.mapper;

import codedriver.framework.cmdb.dto.ci.CiVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectMapper {
    List<CiVo> searchInspectCiCombopList();

    void replaceInspectCiCombopList(@Param("ciVoList") List<CiVo> ciVoList);


}
