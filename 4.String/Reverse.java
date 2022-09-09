class Reverse{
    public static void main(String args[]){
         String name = "My name is Samir";
        String rev = "";
        int len = name.length();
        for(int i = len-1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println("Original String is: "+name);
        System.out.println("Reverse String is: "+rev);
    }
}