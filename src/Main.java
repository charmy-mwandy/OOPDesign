import com.mydomain.design.Journy;
import com.mydomain.design.JournyRun;
import com.mydomain.design.SaladShunguShumba;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[][] myStrings = { {"hello"}, {"java"} };
        for (int index = 0; index < myStrings.length; index++) {
            for(int j = 0; j < myStrings[index].length; ++j) {
                
               // System.out.println(myStrings[i][j]);
            }
        }


        String mySelf = "hello";
        String myName = "java";

        System.out.println((mySelf.concat(myName)).length());
       // String allHuman = mySelf + myName;
        //System.out.println(allHuman.length());
        if (mySelf.length() > myName.length()){
            System.out.println("mySelf is greater.");
        }else {
            System.out.println("myName is not");
        }
        System.out.println((mySelf.concat(myName)));
        System.out.println(mySelf.indexOf("h") + myName.indexOf("j"));

        int hour = 99;
        boolean zooOpen = true || (hour < 4);
        System.out.println(zooOpen); // true

        int owl = 5;
        int food = owl < 2 ? 3 : 4; System.out.println(food);

        int hourDay = 19;
        if (hourDay < 11){
            System.out.println("Goodmorning");
        }else if (hourDay < 15) {
            System.out.println("Goodafternoon");
        } else {
            System.out.println("Goodevening");
        }

        SaladShunguShumba saladShunguShumba = new SaladShunguShumba();
        saladShunguShumba.Eat();



        Journy s1 = new JournyRun();
        System.out.println("Speed is " + s1.Speed(700,3) + " km/hr");
        System.out.println("Time is " + s1.Time(30,120) + " hr");
        System.out.println("Distance is " + s1.Distance(70,3) + " km");
        
    }

    /**static int firstIndex(String[] array, String firstnumber){
        int[] result = new int[] {};
                for(int index = 0;index < array.length;index++){}
    }*/
}
