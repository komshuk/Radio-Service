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

        road.setCurrentStation(4);

        int actual = road.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void maxPositiveNumberStation() {
        Radio road = new Radio();

        road.setCurrentStation(999999999);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void maxNegativeNumberStation() {
        Radio road = new Radio();

        road.setCurrentStation(-999999999);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void positiveNumberStation() {
        Radio road = new Radio();

        road.setCurrentStation(10);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void positiveStation() {
        Radio road = new Radio();

        road.setCurrentStation(9);

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void positiveNumber() {
        Radio road = new Radio();

        road.setCurrentStation(8);

        int actual = road.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void minPositiveNumber() {
        Radio road = new Radio();

        road.setCurrentStation(1);

        int actual = road.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void minPositiveStation() {
        Radio road = new Radio();

        road.setCurrentStation(0);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void minNegativeNumberStation() {
        Radio road = new Radio();

        road.setCurrentStation(-1);

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentSoundVolume() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(5);

        int actual = road.getCurrentSoundVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void maxPositiveSoundVolume() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(999999999);

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void maxNegativeSoundVolume() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(-999999999);

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void positiveSoundVolume() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(11);

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void positiveVolume() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(10);

        int actual = road.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void positiveVolumeSound() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(9);

        int actual = road.getCurrentSoundVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void minPositiveSoundVolume() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(1);

        int actual = road.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void minPositiveVolume() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(0);

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void minNegativeSoundVolume() {
        Radio road = new Radio();

        road.setCurrentSoundVolume(-1);

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(4);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void nextNegativeNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(999999999);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void nextNegativeStation() {
        Radio road = new Radio();
        road.setCurrentStation(10);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void nextValidNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(8);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void nextValidStation() {
        Radio road = new Radio();
        road.setCurrentStation(9);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextMinNegativeNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(-999999999);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void nextMinNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(-1);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void nextNegativeNumbersStation() {
        Radio road = new Radio();
        road.setCurrentStation(0);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void minNextNumbersStation() {
        Radio road = new Radio();
        road.setCurrentStation(1);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void minNextValidStation() {
        Radio road = new Radio();
        road.setCurrentStation(2);

        road.nextStation();

        int actual = road.getCurrentStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void prevNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(5);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void prevNegativeNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(999999999);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevNegativeStation() {
        Radio road = new Radio();
        road.setCurrentStation(10);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevValidNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(8);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void prevValidStation() {
        Radio road = new Radio();
        road.setCurrentStation(9);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void prevMinNegativeNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(-999999999);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevMinNumberStation() {
        Radio road = new Radio();
        road.setCurrentStation(-1);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevNegativeNumbersStation() {
        Radio road = new Radio();
        road.setCurrentStation(0);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevNextNumbersStation() {
        Radio road = new Radio();
        road.setCurrentStation(1);

        road.prevStation();

        int actual = road.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void increaseSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(5);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void increaseValidSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(8);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void increaseValidVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(9);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void increaseSoundVolumeStop() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(10);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void increaseNegativeSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(11);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void increaseMaxSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(999999999);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void increaseMinSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(-999999999);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void increaseNegativeVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(-1);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void increaseMinValidSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(0);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void increaseValidVolumeSound() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(1);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void increaseSoundVolumeValid() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(2);

        road.increaseVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void reduceSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(5);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void reduceValidSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(8);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void reduceValidVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(9);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void reduceSoundVolumeStop() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(10);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void reduceNegativeSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(11);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceMaxSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(999999999);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceMinSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(-999999999);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceNegativeVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(-1);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceMinValidSoundVolume() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(0);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceValidVolumeSound() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(1);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void reduceSoundVolumeValid() {
        Radio road = new Radio();
        road.setCurrentSoundVolume(2);

        road.reduceVolume();

        int actual = road.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
}