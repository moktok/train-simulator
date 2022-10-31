package be.infernalwhale.trains.service;

import be.infernalwhale.trains.model.Train;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;


@Service
public class TrainTrackManagementService {
    private List<Train> trains;

    public TrainTrackManagementService() {
        trains = new CopyOnWriteArrayList<>();
    }

    @Scheduled(fixedDelay = 5000)
    public void tick() {
        System.out.println("Track manager TICK");
        trains.forEach(this::move);
    }

    private void move(Train train) {
        train.moveCloserToTarget();
        if (train.getTravelDistance() == 0) this.trains.remove(train);
    }

    public void addTrain(Train train) {
        if (this.trains == null) this.trains = new CopyOnWriteArrayList<>();
        train.setTravelDistance(new Random().nextInt(8) + 2);
        trains.add(train);
    }
}
