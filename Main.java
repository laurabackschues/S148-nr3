
class Main {
  private static int[] aufstellung = { 1, 3, 5, 7, 8, 11, 13, 14, 16, 19 };

  public static boolean binaereSuche(int[] pArray, int pSuchschluessel) {
    int links, mitte, rechts;
    links = 0;
    rechts = aufstellung.length - 1;

    while (links <= rechts) {
      mitte = (links + rechts) / 2;
      if (pArray[mitte] == pSuchschluessel) {
        return true;

      }
      if (pArray[mitte] < pSuchschluessel) {
        links = mitte + 1;
      }
      if (pArray[mitte] > pSuchschluessel) {
        rechts = mitte - 1;
      }
      
    }
     return false;
  }

  public static void main(String[] args) {
   // System.out.println("Hello World");
    //for (int i = 0; i < aufstellung.length; i++) {
     // System.out.println(aufstellung[i]);
    //}
    if (binaereSuche(aufstellung,7)==true)
    {
      System.out.println("Schweinsteiger spielt mit");
    
    }
  }
 
}
