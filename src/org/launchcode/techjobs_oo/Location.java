package org.launchcode.techjobs_oo;

public class Location extends JobField {

    public Location (String value) {
        super(value);
    }
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Location() {
//        id = nextId;
//        nextId++;
//    }
//
//    public Location(String value) {
//        this();
//        this.value = value;
//    }
//    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
//    //  constructor should also call the empty constructor in order to initialize the 'id' field.
//
//
//    // Custom toString, equals, and hashCode methods:
//   //Repeated code
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    //this might be repeated code in all the classes
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}
