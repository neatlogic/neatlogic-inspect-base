package codedriver.framework.inspect.dao.mapper;

import codedriver.framework.cmdb.dto.ci.CiVo;
import codedriver.framework.inspect.dto.InspectCiCombopVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectMapper {
    List<InspectCiCombopVo> searchInspectCiCombopList();

    void replaceInspectCiCombopList(@Param("ciVoList") List<CiVo> ciVoList);


}
