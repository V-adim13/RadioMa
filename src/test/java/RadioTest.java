import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    // Текущая станция
    @Test
    public void shouldStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.station();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldStationn() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.station();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.station();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        public void shouldNextStation() {
            Radio radio = new Radio();
            radio.setCurrentStation(7);
            radio.nextStation();
            int expected = 8;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // прошлая станция
        @Test
        public void shouldPastStation () {
            Radio radio = new Radio();
            radio.setCurrentStation(8);
            radio.pastStation();
            int expected = 7;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        //Станция с 9 на 0
        @Test
        public void shouldLopedStation () {
            Radio radio = new Radio();
            radio.setCurrentStation(10);
            radio.lopedStation();
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }
    @Test
    public void shouldLopedStat () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.lopedStation();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldLopedStationn () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.lopedStation();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

        // C 0 на 9
        @Test
        public void shouldReverseStation () {
            Radio radio = new Radio();
            radio.setCurrentStation(0);
            radio.reverseStation();
            int expected = 9;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }
    @Test
    public void shouldReverStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.reverseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

        ///К текущей
        @Test
        public void shouldAaStation () {
            Radio radio = new Radio();
            radio.setCurrentStation(-1);
            radio.station();
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }
    }








