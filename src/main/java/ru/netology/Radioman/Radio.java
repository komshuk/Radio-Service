package ru.netology.Radioman;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getSoundVolume() {
        return currentVolume;
    }

    public void setValidCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > getMaxStation()) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setValidCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > getMaxVolume()) {
            return;
        }
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < getMaxVolume()) {
            currentVolume = newCurrentVolume;
        }
    }

    public void setCurrentStationMax(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (newCurrentStation < getMaxStation()) {
            currentStation = newCurrentStation + 1;
        }
        if (newCurrentStation >= getMaxStation()) {
            currentStation = 0;
        }
        if (newCurrentStation < 0) {
            currentStation = 0;
        }
    }

    public void setSoundVolumeAdd(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume < getMaxVolume()) {
            currentVolume = currentVolume + 1;
        }
        if (newCurrentVolume > getMaxVolume()) {
            currentVolume = getMaxVolume();
        }
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        }
    }

    public void setCurrentStationMin(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation - 1;
        }
        if (newCurrentStation <= 0) {
            currentStation = getMaxStation();
        }
        if (newCurrentStation > getMaxStation()) {
            currentStation = 0;
        }
    }

    public void setSoundVolumeReduce(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (newCurrentVolume > getMaxVolume()) {
            currentVolume = 0;
        }
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        }
    }

    public int getMaxStation() {
        return 9;
    }

    public int getMaxVolume() {
        return 10;
    }
}