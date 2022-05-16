public class Location {
private int x;
private int y;

public Location(int X, int Y) {
   x = X;
   y = Y;
}

public boolean equals(Object other) {
   if(this == other) {
      return true;
   }
   if(!(other instanceof Location)) {
      return false;
   }
   Location other1 = (Location) other;
   return (getRow() == other1.getRow() && getCol() == other1.getCol());
}

public String toString() {
return "(" + x + ", " + y + ")";
}
public int getRow() {
   return x;
}

public int getCol() {
   return y;
}

}