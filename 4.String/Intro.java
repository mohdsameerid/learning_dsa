class Intro{
    public static void main(String args[]){
        // String name = "Samir";

        // for get character use -> String_name.charAt(idx)
        //    char ch = name.charAt(1);
        //    System.out.println(ch); // a

        //    System.out.println(name.charAt(0)); // S
        //    System.out.println(name.charAt(1)); // a
        //    System.out.println(name.charAt(2)); // m
        //    System.out.println(name.charAt(3)); // i
        //    System.out.println(name.charAt(4)); // r

        // for counting length of String -> String_name.length()
        //    System.out.println(name.length());

        //    String str = "Hello";
        // for getting a SubString  -> String_name.substring(idx);
            // System.out.println(str.substring(1));  // ello
        // Start idx , end idx   ->  String_name.substring(sidx, eidx);
            // System.out.println(str.substring(1,3)); // el


         // exception in substring 
         // 1)
        //  System.out.println(str.substring(5));// " " nothing empty String
         // 2)
        //  System.out.println(str.substring(5,5)); // " "
         // 3)
        //  System.out.println(str.substring(0,6));  
         // Runtime Error(Exception in thread "main" 
         // java.lang.StringIndexOutOfBoundsException: Range [0, 6) 
         // out of bounds for length 5)


         // String s = "hhs sdjd sdabjj dsabjsa sds";
        //  String arr[] = s.split(" ");
        //  for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        //  }
         
        // String s = "hhs,sdjd,sdabjj,dsabjsa sds";
        // String arr[] = s.split(",");
        
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        String s = "fdw";
        // for Adding Character
        s += ' ';
        s += 'W';
        s += 'n';
        System.out.println(s);

        System.out.println("Hello"+10+20); // Hello1020
        System.out.println(10+20+"Hello"); // 30Hello
        System.out.println(10+"Hello"+20); // 10Hello20
    }
}

