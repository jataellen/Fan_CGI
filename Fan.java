public class Fan {
  private int speed;
  private boolean direction;

  /**
  * Class Constructor
  */
  public Fan() {
      this.speed = 0;
      this.direction = true;
  }

  /**
  * @return int speed of fan
  * from levels 0-3 (0=off)
  */
  public int getSpeed(){
    return this.speed;
  }

  /**
  * @return boolean direction of fan
  * (true = Right, false = Left)
  */
  public boolean getDirection(){
    return this.direction;
  }

  /**
  * On method call, speed is incremented by 1 from 0-3
  * call on speed=3 sets speed back to 0
  */
  public void changeSpeed(){
    this.speed= (this.speed+1)%4;
  }

  /**
  * On method call, direction toggled between Left/Right
  * (true = Right, false = Left)
  */
  public void changeDirection(){
    this.direction= (!this.direction);
  }

  /**
  * @return String description of current fan settings
  */
  public String toString() {
      String directionString = "Right";
      if (!this.direction){
        directionString= "Left";
      }
      return ("Fan Speed: " + this.speed + "\nFan Direction: " + directionString);
  }
}
