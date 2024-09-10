package com.bensoli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdddServlet extends HttpServlet
{
	public static void main(String[] args)
	{
		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		k = k*k;
//		PrintWriter out = res.getWriter();
//		out.println("Result is " + k);
		
		req.setAttribute("k", k);
		
		//using request dispatcher or redirect to call a servlet inside a servlet
		
		RequestDispatcher rd = req.getRequestDispatcher("sqr");
		rd.forward(req, res);
	}
	
	
}
