import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VolumeTest {
    // громкость
    @Test
    public void shouldVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(5);
        volume.volume();
        int expected = 5;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldVolumee() {
        Volume volume = new Volume();
        volume.setCurrentVolume(0);
        volume.volume();
        int expected = 1;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

        @Test
    public void shouldNextVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(5);
        volume.nextVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test
    public void shouldPastVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(10);
        volume.pastVolume();
        int expected = 11;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldPastVolumen() {
        Volume volume = new Volume();
        volume.setCurrentVolume(11);
        volume.pastVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumem() {
        Volume volume = new Volume();
        volume.setCurrentVolume(-1);
        volume.volumem();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumemb() {
        Volume volume = new Volume();
        volume.setCurrentVolume(2);
        volume.volumem();
        int expected = 1;
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }
}

