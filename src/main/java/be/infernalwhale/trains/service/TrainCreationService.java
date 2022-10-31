package be.infernalwhale.trains.service;

import be.infernalwhale.trains.model.Train;
import be.infernalwhale.trains.model.TrainManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TrainCreationService {
    private List<TrainManager> managers;

    private TrainTrackManagementService trainTrackManagementService;

    @Value("${list.names}")
    private List<String> names;
    @Value("${list.stations}")
    private List<String> stations;

    public TrainCreationService(TrainTrackManagementService service) {
        this.trainTrackManagementService = service;
    }

    @Scheduled(fixedDelay = 5000)
    public void createTrain() {
        Random rnd = new Random();

        System.out.println("Creating new train.");
        Train train = new Train();
        train.setId((long)(rnd.nextInt(899999) + 100000));

        TrainManager manager = new TrainManager();
        manager.setName(names.get(rnd.nextInt(names.size())));
        train.setManager(manager);

        System.out.println("Created train and handing it to track manager");
        trainTrackManagementService.addTrain(train);
    }
}
