package com.checking.thatfella;

import com.checking.thatfella.checkers.NumChecker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class CheckCaller {
    private List<NumChecker> checkerList=new LinkedList<NumChecker>();


    public void setCheckerList(List<NumChecker> checkerList) {
        this.checkerList = checkerList;
    }

   public Map<String, Object>  checkAll(int newnum) {

       Map<String,Object> checkmap = new HashMap<String,Object>();
       for (NumChecker ch: checkerList) {
         checkmap.put(ch.check(newnum), newnum);
       }
       return checkmap;
    }


}