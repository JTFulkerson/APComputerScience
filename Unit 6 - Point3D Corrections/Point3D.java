public class Point3D extends Point implements Comparable<Point3D> {
   private int z;

   public Point3D() {
      super();
      z = 0;
   }

   public Point3D(int X, int Y, int Z) {
      super(X, Y);
      z = Z;
   }

   public void setLocation(int X, int Y) {
      super.setLocation(X, Y);
      z = 0;
   }

   public void setLocation(int X, int Y, int Z) {
      super.setLocation(X, Y);
      z = Z;
   }

   public int getZ() {
      return z;
   }

   public double distanceFromOrigin() {
      return Math.sqrt(Math.pow(super.getX(), 2) + Math.pow(super.getY(), 2) + Math.pow(z, 2));
   }

   public String toString() {
      return "(" + super.getX() + ", " + super.getY() + ", " + z;
   }

   public int compareTo(Point3D that) {
      if (this.getX() == that.getX()) {
         if(this.getY() == that.getY()) {
            if(this.getZ() > that.getZ()) {
               return 1;
            }
            if(this.z == that.getZ()) {
               return 0;
            }
            return -1;
         }
         return 1;
      }
      return 1;
   }
}