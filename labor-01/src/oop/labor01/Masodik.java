package oop.labor01;

public class Masodik {
    public static void main(String[] args) {
        String name="Medve Noemi Nora";
        System.out.println(name);
        String surname=String.valueOf(name.charAt(0));
        String lastname = null;
        for(int i=0; i<name.length(); ++i){
            if(name.charAt(i)==' '){
                lastname= String.valueOf(name.charAt(i+1));
            }
            System.out.println(name.charAt(i));
        }
        String monogram=surname + lastname;
        System.out.println("Monogram:" + monogram);
    }
}
