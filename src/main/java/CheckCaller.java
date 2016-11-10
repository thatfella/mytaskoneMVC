import checkers.NumChecker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class CheckCaller {
    public List<NumChecker> checkerList;

    public String check(int num) {
        for (NumChecker nc : checkerList) {
            nc.check(num);
        }
        return "TOTAL CHECKED";
    }

    public void setCheckerList(List checkerList) {
        this.checkerList = checkerList;
    }


   public String checkAll(int newnum) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mytaskone/src/main/webapp/WEB-INF/myserv.xml");
        NumChecker ch = (NumChecker) ctx.getBean("caller");
        ch.check(newnum);
        return "Checked";
    }


}