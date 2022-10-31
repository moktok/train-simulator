package be.infernalwhale.springdemo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class NeedyService {
    private final AnImportantService importantService;

    public NeedyService(AnImportantService importantService) {
        System.out.println("Create NeedyService...");
        this.importantService = importantService;
    }
}
