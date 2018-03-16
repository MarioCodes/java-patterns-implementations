package es.msanchez.patterns.singleton;

/**
 * Implementing Singleton as a class, the same object reference will be return and no other Elvis
 * instance will ever be created. BUT the private constructor may be called reflectively and IS NOT
 * serializable safe.
 */
public class ElvisClassSingl {

  private static final ElvisClassSingl INSTANCE = new ElvisClassSingl();

  private ElvisClassSingl() {
  }

  public static ElvisClassSingl getInstance() {
    return INSTANCE;
  }

  public void leaveTheBuilding() {
    System.out.println("Elvis left the building.");
  }

}
