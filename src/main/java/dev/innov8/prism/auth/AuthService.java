package dev.innov8.prism.auth;

import dev.innov8.prism.common.exceptions.AuthenticationException;
import dev.innov8.prism.organization.OrgRepository;
import dev.innov8.prism.organization.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final OrgRepository orgRepository;

    @Autowired
    public AuthService(OrgRepository orgRepository) {
        this.orgRepository = orgRepository;
    }

    public Organization authenticate(String orgId, String authCode) {
        return orgRepository.findOrganizationByIdAndAuthCode(orgId, authCode).orElseThrow(AuthenticationException::new);
    }

}
