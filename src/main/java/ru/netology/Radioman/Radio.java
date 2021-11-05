package ru.netology.Radioman;

public class Radio {

    private int currentStation;
    private int currentSoundVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > getMaxStation()) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > getMaxVolume()) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void nextStation() {
        if (currentStation <= getMaxStation()) {
            currentStation = currentStation + 1;
        }
        if (currentStation > getMaxStation()) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation >= 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = getMaxStation();
        }
    }

    public void increaseVolume() {
        if (currentSoundVolume < getMaxVolume()) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

    public int getMaxStation() {
        return 9;
    }

    public int getMaxVolume() {
        return 10;
    }
}