public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else
        {
        //int megaBytes = printMegaBytesAndKiloBytes(1024);
            int megaBytes = Math.round(kiloBytes /1024);
            int remainingKilobytes = kiloBytes % 1024;

            System.out.println( kiloBytes + "KB = " + megaBytes + "MB and " + remainingKilobytes + "KB" );
    }
      // Math.round(kiloBytes /1024);

}}
