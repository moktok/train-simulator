package be.infernalwhale.trains.model;

public class Train {
    private Long id;

    private TrainType type;
    private Long maxLoad;
    private TrainManager manager;
    private String fromStation;
    private String toStation;
    // Make this transient
    private int travelDistance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TrainType getType() {
        return type;
    }

    public void setType(TrainType type) {
        this.type = type;
    }

    public Long getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Long maxLoad) {
        this.maxLoad = maxLoad;
    }

    public TrainManager getManager() {
        return manager;
    }

    public void setManager(TrainManager manager) {
        this.manager = manager;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public void moveCloserToTarget() {
        this.travelDistance--;
        System.out.println(String.format("Train %d is at %d distance from target.", id, travelDistance));
    }

    public void setTravelDistance(int travelDistance) {
        this.travelDistance = travelDistance;
    }

    public int getTravelDistance() {
        return this.travelDistance;
    }
}
