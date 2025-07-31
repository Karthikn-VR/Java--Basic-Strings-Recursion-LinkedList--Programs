import java.util.Scanner;

class CharacterOrNot {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char something = sc.next().charAt(0);
      if(Character.isAlphabetic(something)){
        System.out.println("is Apphabet");
        if(something == 'a' || something == 'e' || something == 'i' || something == 'o' || something == 'u'){
            System.out.println("Is Vowel");
        }
        else{
            System.out.println("is Consonant");
        }
      }
      else{
        System.out.println("Not A Alphabet");
      }
  }  
}
