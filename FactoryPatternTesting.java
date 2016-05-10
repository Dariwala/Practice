/**
 * Created by Shehab on 5/9/2016.
 */

import java.util.Scanner;

public class FactoryPatternTesting {
    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine())
        {
            FactoryPattern f = new FactoryPattern();

            String s = sc.nextLine();

            Man m = f.factory(s);

            m.show();
        }
    }

}
