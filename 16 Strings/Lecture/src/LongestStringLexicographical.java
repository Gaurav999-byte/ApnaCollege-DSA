public class LongestStringLexicographical {
    public static void main(String[]args){
        String fruits[]={"apple","mango","banana"};

        String Largest=fruits[0];

        for (int i = 1; i <fruits.length ; i++) {

            if (Largest.compareTo(fruits[i])<0){
                Largest=fruits[i];
            }
        }
        System.out.println("Largest:"+Largest); //Lexicographically
    }
}
