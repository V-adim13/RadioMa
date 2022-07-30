public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    //Станции
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    // Текущая станция
    public void station() {
        if (currentStation >= 9) {
            currentStation++;
        }
    }
// следущая
    public void nextStation() {
        if (currentStation > 0) {
            currentStation++;
        }
    }
    //Предыдущая станция
      public void pastStation() {
          if (currentStation > 0) {
             currentStation--;
        }
     }
 // Станция С 9 на 0
  public void lopedStation() {
      if (currentStation >=9) {
          currentStation ++;
      } else {
          currentStation = 0;
      }
      }
   // Станция с 0 на 9
     public void reverseStation() {
      if (currentStation > 0) {
           currentStation--;
      } else {
          currentStation = 9;
      }
      }
  }
