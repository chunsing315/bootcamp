public enum Direction {
  EAST(1), NORTH(2), WEST(-1), SOUTH(-2);

  private int value;

  private Direction(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // Advantage: Able to present some relationship among the enum objects
  public boolean isOppsite(Direction direction) {
    return this.value == direction.getValue() * -1;
  }

  public static boolean isOppsite(Direction d1, Direction d2) {
    return d1.getValue() == d2.getValue() * -1;
  }

  public Direction oppsite() {
    for (Direction direction : Direction.values()) {
      if (direction.getValue() == this.value * -1)
        return direction;
    }
    return null;
  }

  public static Direction oppsite(Direction direction) {
    for (Direction d : Direction.values()) {
      if (d.getValue() == direction.getValue() * -1)
        return d;
    }
    return null;
  }

  public static void main(String[] args) {
    // Direction -> class/ enum
    // Direction.EAST -> object
    System.out.println(Direction.EAST.isOppsite(Direction.WEST)); // true
    System.out.println(Direction.EAST.isOppsite(Direction.NORTH)); // false
    System.out.println(Direction.SOUTH.oppsite()); // NORTH
    System.out.println(Direction.WEST.oppsite()); // EAST

    // static method
    System.out.println(Direction.isOppsite(Direction.EAST, Direction.WEST)); // true
    System.out.println(Direction.isOppsite(Direction.EAST, Direction.NORTH)); // false
    System.out.println(Direction.oppsite(Direction.SOUTH)); // NORTH
    System.out.println(Direction.oppsite(Direction.WEST)); // EAST
  }
}
