package ru.netology.Radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void maxNumberStation() {
        Radio road = new Radio();

        int actual = road.getMaxStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void maxSoundVolume() {
        Radio road = new Radio();

        int actual = road.getMaxVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void currentNumberStation() {
        Radio road = new Radio();

        road.setValidCurrentStation(4);

        int actual = road.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void currentNegativeMin() {
        Radio road = new Radio();

        road.setValidCurrentStation(-1161616156);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentNegativeNumberMin() {
        Radio road = new Radio();

        road.setValidCurrentStation(-1);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentNumberStationMin() {
        Radio road = new Radio();

        road.setValidCurrentStation(0);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentNumberMin() {
        Radio road = new Radio();

        road.setValidCurrentStation(1);

        int actual = road.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void currentNegativeMax() {
        Radio road = new Radio();

        road.setValidCurrentStation(1031561651);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentNegativeNumberMax() {
        Radio road = new Radio();

        road.setValidCurrentStation(10);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentNumberStationMax() {
        Radio road = new Radio();

        road.setValidCurrentStation(9);

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void currentNumberMax() {
        Radio road = new Radio();

        road.setValidCurrentStation(8);

        int actual = road.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void currentSoundVolume() {
        Radio road = new Radio();

        road.setValidCurrentVolume(5);

        int actual = road.getSoundVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void currentNegativeVolume() {
        Radio road = new Radio();

        road.setValidCurrentVolume(-1649849849);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentNegativeVolumeMin() {
        Radio road = new Radio();

        road.setValidCurrentVolume(-1);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentSoundVolumeMin() {
        Radio road = new Radio();

        road.setValidCurrentVolume(0);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeMin() {
        Radio road = new Radio();

        road.setValidCurrentVolume(1);

        int actual = road.getSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void currentNegativeMaxi() {
        Radio road = new Radio();

        road.setValidCurrentVolume(1198161619);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentNegativeVolumeMax() {
        Radio road = new Radio();

        road.setValidCurrentVolume(11);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentSoundVolumeMax() {
        Radio road = new Radio();

        road.setValidCurrentVolume(10);

        int actual = road.getSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeMax() {
        Radio road = new Radio();

        road.setValidCurrentVolume(9);

        int actual = road.getSoundVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void nextNumberStation() {
        Radio road = new Radio();

        road.setCurrentStationMax(4);

        int actual = road.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void nextNumberNegativeMax() {
        Radio road = new Radio();

        road.setCurrentStationMax(1098798798);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextNumberNegativeStationMax() {
        Radio road = new Radio();

        road.setCurrentStationMax(10);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextNumberStationMax() {
        Radio road = new Radio();

        road.setCurrentStationMax(9);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        Radio road = new Radio();

        road.setCurrentStationMax(8);

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void nextNumberNegativeStationMin() {
        Radio road = new Radio();

        road.setCurrentStationMax(-654161651);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextNumberStationMin() {
        Radio road = new Radio();

        road.setCurrentStationMax(-1);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationMin() {
        Radio road = new Radio();

        road.setCurrentStationMax(0);

        int actual = road.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationNumberMin() {
        Radio road = new Radio();

        road.setCurrentStationMax(1);

        int actual = road.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void addVolume() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(5);

        int actual = road.getSoundVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void addNegativeMaxi() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(941616519);

        int actual = road.getSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void addNegativeVolumeMaxi() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(11);

        int actual = road.getSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void addVolumeMax() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(10);

        int actual = road.getSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void addSoundVolumeMax() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(9);

        int actual = road.getSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void addNegativeMin() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(-941616519);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void addNegativeVolumeMin() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(-1);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void addVolumeMin() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(0);

        int actual = road.getSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void addSoundVolumeMin() {
        Radio road = new Radio();

        road.setSoundVolumeAdd(1);

        int actual = road.getSoundVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void prevNumberStation() {
        Radio road = new Radio();

        road.setCurrentStationMin(4);

        int actual = road.getCurrentStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void prevNumberNegativeStationMin() {
        Radio road = new Radio();

        road.setCurrentStationMin(-984949494);

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevNegativeNumberStationMin() {
        Radio road = new Radio();

        road.setCurrentStationMin(-1);

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevNumberStationMin() {
        Radio road = new Radio();

        road.setCurrentStationMin(0);

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevNumberMin() {
        Radio road = new Radio();

        road.setCurrentStationMin(1);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prevNumberNegativeStationMax() {
        Radio road = new Radio();

        road.setCurrentStationMin(984949494);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prevNegativeNumberStationMax() {
        Radio road = new Radio();

        road.setCurrentStationMin(10);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prevNumberStationMax() {
        Radio road = new Radio();

        road.setCurrentStationMin(9);

        int actual = road.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void prevNumberMax() {
        Radio road = new Radio();

        road.setCurrentStationMin(8);

        int actual = road.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(5);

        int actual = road.getSoundVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void reduceNegativeVolumeMin() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(-984984616);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeNegativeMin() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(-1);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeMin() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(0);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceSoundVolumeMin() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(1);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceNegativeVolumeMax() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(984984616);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeNegativeMax() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(11);

        int actual = road.getSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeMax() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(10);

        int actual = road.getSoundVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void reduceSoundVolumeMax() {
        Radio road = new Radio();

        road.setSoundVolumeReduce(9);

        int actual = road.getSoundVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }
}