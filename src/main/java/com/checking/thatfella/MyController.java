package com.checking.thatfella;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

 @Controller
public class MyController {


     private  CheckCaller checkcal=new CheckCaller();

     @Autowired
     public void setCheckcal(CheckCaller checkcal){this.checkcal=checkcal;}


   @RequestMapping(value= {"/ch","/ch/"}, method = RequestMethod.GET)
   public String Result(@RequestParam(value="number", required = false) String number, Map<String,Object> reqPar)
   {
           reqPar.put("number",number);
       int num= Integer.parseInt(String.valueOf(reqPar.get("number")));
      reqPar.put("num",num);
      reqPar.put("checked",checkcal.checkAll(num));

           return "/WEB-INF/views/totalres.jsp";

   }

}
