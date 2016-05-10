/**
 * Created by Shehab on 5/9/2016.
 */
abstract class Man {

    private String name;
    private double damage;

    void setName(String a){
        name = a;
    }

    void setDamage(double a){

        damage = a;
    }

    void show(){

        System.out.println(name + " " + damage);
    }
}
