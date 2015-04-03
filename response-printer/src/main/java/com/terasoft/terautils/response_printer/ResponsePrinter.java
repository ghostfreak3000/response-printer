/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.terasoft.terautils.response_printer;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bishaka
 */
public class ResponsePrinter {
   
    private static final Gson JSON = new Gson();

    public static void printCollectionJson(HttpServletResponse response, Object obj)
            throws ServletException, IOException
    {
        response.setContentType("application/vnd.collection+json");
        response.getWriter().print(JSON.toJson(obj));
    }

    public static void printCollectionJson(HttpServletResponse response, String svs, String status)
            throws ServletException, IOException
    {
    	printCollectionJson(response, new Resp(svs, status));
    }
    
    public static void printJson(HttpServletResponse response, Object obj)
            throws ServletException, IOException
    {
        response.setContentType("application/json");
        response.getWriter().print(JSON.toJson(obj));
    }

    public static void printJson(HttpServletResponse response, String svs, String status)
            throws ServletException, IOException
    {
    	printJson(response, new Resp(svs, status));
    }
    
    
    public static void printTxt(HttpServletResponse response, Object obj)
            throws ServletException, IOException
    {
        response.setContentType("text/utf-8");
        response.getWriter().print(obj);
    }
    
    public static void printTxt(HttpServletResponse response, String svs, String status)
            throws ServletException, IOException
    {
    	printTxt(response, new Resp(svs, status));
    }    
    
    public static void printHtml(HttpServletResponse response, Object obj)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(obj);
    }    
    
    public static void printHtml(HttpServletResponse response, String svs, String status)
            throws ServletException, IOException
    {
    	printHtml(response, new Resp(svs, status));
    }     
}
