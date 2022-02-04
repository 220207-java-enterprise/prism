package dev.innov8.prism.organization.dtos;

import javax.validation.constraints.NotBlank;

public class ResetAuthCodeRequest {

    @NotBlank
    private String orgId;

    @NotBlank
    private String orgKey;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgKey() {
        return orgKey;
    }

    public void setOrgKey(String orgKey) {
        this.orgKey = orgKey;
    }

    @Override
    public String toString() {
        return "ResetAuthCodeRequest{" +
                "orgId='" + orgId + '\'' +
                ", orgKey='" + orgKey + '\'' +
                '}';
    }

}
