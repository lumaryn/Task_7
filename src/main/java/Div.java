class Div {
   private int a;
    public int getA(int i, int y) {
        try {
            a = i / y;

       }catch (Exception e) {
       // e.getMessage();
        System.out.println("Error");
   }

        return a;
    }}