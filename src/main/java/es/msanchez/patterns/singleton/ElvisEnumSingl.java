package es.msanchez.patterns.singleton;

/**
 * This version is the same as implementing the singleton with a class, but it's more concise,
 * serialization-safe and safe against refelction attacks. Use of this version is prefered.
 * IT CANNOT BE USED if your class must extend a superclass other than Enum!
 */
public enum ElvisEnumSingl {
    INSTANCE;

  public void leaveTheBuilding() {
    System.out.println("Elvis left the building.");
  }
}
