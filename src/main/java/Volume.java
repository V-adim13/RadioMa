public class Volume {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10){
            return;
        }
        this.currentVolume = currentVolume;
    }
    //Текущая громкость
    public void volume(){
        if (currentVolume <= 0) {
            currentVolume++;
        }
    }
    //Повышение громкости
    public void nextVolume(){
        if (currentVolume > 0) {
            currentVolume ++;
        }
    }
    //граничная
    public void pastVolume(){
        if (currentVolume >=10) {
            currentVolume ++;
        } else {
            currentVolume = 10;
        }
    }
    //
    public void volumem(){
        if (currentVolume > 0) {
            currentVolume --;
        }


    }

}

