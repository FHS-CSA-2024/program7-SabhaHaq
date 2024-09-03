
public class Program7 {

       private static final int klevinPerShruteBuck= 20; 
       private static final int stanleyNickelsPerKlevin= 12; 
       private static final int stanleyNickelPerShruteBuck = klevinPerShruteBuck*stanleyNickelsPerKlevin; 
   
 public static double convert ( double shruteBucks, double klevins, double stanleyNickels) {
          double totalStanleyNickels = (shruteBucks*stanleyNickelPerShruteBuck)+
          (klevins* stanleyNickelsPerKlevin) + stanleyNickels;
          double decimalShruteBucks= totalStanleyNickels / stanleyNickelPerShruteBuck; 
          return decimalShruteBucks;
        }
          

        }
