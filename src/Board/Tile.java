package Board;

public class Tile {

  private float x;
  private float y;
  private float width;
  private float height;

  public Tile(float x, float y, float witdh, float height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public float getX() {
    return this.x;
  }

  public float getY() {
    return this.y;
  }

  public float getWidth() {
    return this.width;
  }

  public float getHeight() {
    return this.height;
  }
}
