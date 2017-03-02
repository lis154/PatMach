import java.util.regex.*;


import static java.util.regex.Pattern.*;

/**
 * Created by i.lapshinov on 02.03.2017.
 */
public class PatMach {

    public static void main(String[] args)
    {
        String mas = "stroka1 strok sdf" +  " stro stroka2" +  "ssdf fsd sfds stroka3";

        String s = "stro";
        Pattern p = Pattern.compile(s);

        Matcher m = p.matcher(mas);

        while (m.find())
        {
            System.out.println(m.group());
        }


    }

}
