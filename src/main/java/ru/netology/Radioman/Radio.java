package ru.netology.Radioman;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getMaxStation() {
        return 9;
    }

    public int getMaxVolume() {
        return 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getSoundVolume() {
        return currentVolume;
    }

    public void setValidCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation;
        }
    }

    public void setValidCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume;
        }
    }

    public void setCurrentStationMax(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation + 1;
        }
        if (newCurrentStation >= 9) {
            currentStation = 0;
        }
        if (newCurrentStation < 0) {
            currentStation = 0;
        }
    }

    public void setSoundVolumeAdd(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (newCurrentVolume > 10) {
            currentVolume = 10;
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
            currentStation = 9;
        }
        if (newCurrentStation > 9) {
            currentStation = 0;
        }
    }
    public void setSoundVolumeReduce(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (newCurrentVolume > 10) {
            currentVolume = 0;
        }
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        }
    }
}