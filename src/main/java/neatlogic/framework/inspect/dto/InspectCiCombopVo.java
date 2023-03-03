package neatlogic.framework.inspect.dto;

import neatlogic.framework.cmdb.dto.ci.CiVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class InspectCiCombopVo extends CiVo {

    @EntityField(name = "combopId", type = ApiParamType.LONG)
    private Long combopId;
     @EntityField(name = "combopName", type = ApiParamType.STRING)
    private String combopName;

    public InspectCiCombopVo(CiVo ciVo) {
        super.setId( ciVo.getId());
        super.setName(ciVo.getName());
        super.setLabel(ciVo.getLabel());
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
