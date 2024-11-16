package parent;

public class Father {
  private String name;
  
  // implicitly empty constructor
  public Father() {

  }

  // When there is a non-empty constructor, the class will remove the empty constructor
  public Father(String name) {
    this.name = name;
  }
}
