/**
 * Created by Shehab on 5/9/2016.
 */
public class FactoryPattern {

    public static Man factory(String a)
    {
        Man m = null;
        if(a.equals("X")){
            m =  new XMan("fufu",9.3);
        }else
        if(a.equals("S")) m =  new SpiderMan("khala", 9.2);

        return m;
    }
}
