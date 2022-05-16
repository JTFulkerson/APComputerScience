public class Bee extends Insect implements FlyingObject {
   private boolean isFly;
   public Bee(int s, String c) {
      super(s, c);
   }
   public void fly() {
      isFly = true;
      System.out.println("Flying");
   }

   public void land() {
      isFly = false;
      System.out.println("Landed");
   }

   public boolean isFlying() {
      return isFly;
   }
   
   public void move() {
      System.out.println("Fly");
   }
   
   public void attack() {
      this.move(); //assuming an insect needs to move before attacking
      super.attack();
      //System.out.println("Attack!!");
   }
}