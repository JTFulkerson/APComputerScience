public class Sound {
   private int[] samples;

   public Sound(int[] s) {
      samples = s;
   }
   
   public int[] getSamples() {
      return samples;
   }
   
   public int limitAmplitude(int limit) {
      int nLimit = 0 - limit;
      int changes = 0;
      for(int i = 0; i < samples.length; i++) {
         if(samples[i] < nLimit) {
            samples[i] = nLimit;
            changes++;
         } else if (samples[i] > limit) {
            samples[i] = limit;
            changes++;
         }
      }
      return changes;
   }

   public void trimSilenceFromBeginning() {
      boolean flag = false;
      int counter = 0;
      while(flag == false) {
         if(samples[counter] != 0) {
            flag = true;
         }
         else {
            counter++;
         }
      }
      int[] temp = new int[samples.length - counter];
      for(int i = 0; i < temp.length; i++) {
         temp[i] = samples[i + counter];
      }
      samples = temp;
   }
}