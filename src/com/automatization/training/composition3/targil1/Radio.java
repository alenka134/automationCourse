package com.automatization.training.composition3.targil1;

public class Radio {
    private boolean switchStatus;
    private Station[] stations;
    private Station currentStation;

    public Radio() {
        Station stationGlalgalatz = new Station("Galgalatz", 98.0);
        Station stationMusic = new Station("Music", 104.7);
        stations = new Station[]{stationGlalgalatz, stationMusic};
        this.switchStatus = false;
        this.currentStation = stations[0];
    }

    public Station[] getStations() {
        return stations;
    }

    public void setStations(Station[] stations) {
        this.stations = stations;
    }

    public boolean isSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(boolean switchStatus) {
        this.switchStatus = switchStatus;
    }

    public Station getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(Station currentStation) {
        this.currentStation = currentStation;
    }
}
