import com.sun.deploy.net.HttpResponse;
import org.omg.CORBA.Request;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by ESALE on 29.10.2016.
 */
@Controller
public class MyController {
  CheckCaller checkcal;
    Map<String,Object> resmap;
    @RequestMapping(value="number", method= RequestMethod.GET)

    public String showCheck(Map<String,Object> resmap, int innum) {
         resmap.put(checkcal.check(innum), innum);

        return "/index.jsp";
    }


}
