package dev.innov8.prism.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgService {

    private final OrgRepository orgRepo;

    @Autowired
    public OrgService(OrgRepository orgRepo) {
        this.orgRepo = orgRepo;
    }

    // CREATE READ UPDATE DELETE

}
