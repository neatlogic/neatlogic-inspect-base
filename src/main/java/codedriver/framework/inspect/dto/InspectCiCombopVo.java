package codedriver.framework.inspect.dto;

import codedriver.framework.cmdb.dto.ci.CiVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

public class InspectCiCombopVo extends CiVo {

    @EntityField(name = "combopId", type = ApiParamType.LONG)
    private Long combopId;
     @EntityField(name = "combopName", type = ApiParamType.STRING)
    private String combopName;

    public InspectCiCombopVo(CiVo ciVo) {
        super.id = ciVo.getId();
        super.name = ciVo.getName();
        super.label = ciVo.getLabel();
    }

    public InspectCiCombopVo() {

    }

    public Long getCombopId() {
        return combopId;
    }

    public void setCombopId(Long combopId) {
        this.combopId = combopId;
    }

    public String getCombopName() {
        return combopName;
    }

    public void setCombopName(String combopName) {
        this.combopName = combopName;
    }
}
