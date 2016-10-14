package org.wso2.carbon.identity.user.mgt.model;

import org.wso2.carbon.security.caas.user.core.claim.Claim;

import java.util.ArrayList;
import java.util.List;

public class UserModel {

    private List<Claim> userClaims = new ArrayList<>();

    public List<Claim> getUserClaims() {
        return userClaims;
    }

    public void setUserClaims(List<Claim> userClaims) {
        this.userClaims = userClaims;
    }
}
