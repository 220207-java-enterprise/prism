package dev.innov8.prism.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrgController {

    private final OrgService orgService;

    @Autowired
    public OrgController(OrgService orgService) {
        this.orgService = orgService;
    }

    // GET all
    // GET by id
    // GET by email
    // POST new
    // PATCH existing
    // DELETE (soft)

}
