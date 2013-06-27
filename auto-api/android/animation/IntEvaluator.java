package android.animation;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class IntEvaluator implements TypeEvaluator<Integer> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:35:48.585 -0400", hash_original_method = "2EF7111110D38FEB0992107126625CBA", hash_generated_method = "2EF7111110D38FEB0992107126625CBA")
    public IntEvaluator ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:35:48.610 -0400", hash_original_method = "6401BD46F7D1EA9F5782F720B53B51D0", hash_generated_method = "CEB0ECBD9FD3CED91E29E02B62D35631")
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        Integer varB4EAC82CA7396A68D541C85D26508E83_2002962891 = null; //Variable for return #1
        int startInt;
        startInt = startValue;
        varB4EAC82CA7396A68D541C85D26508E83_2002962891 = (int)(startInt + fraction * (endValue - startInt));
        addTaint(fraction);
        addTaint(startValue.getTaint());
        addTaint(endValue.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_2002962891.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2002962891;
        // ---------- Original Method ----------
        //int startInt = startValue;
        //return (int)(startInt + fraction * (endValue - startInt));
    }

    
}

