package com.demo.rahul;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitCounter")

public class VisitCounter extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	int i=-1;
	public void init()
	{
		i=1;
	}
	

	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out= res.getWriter();
		out.println(i++);
		
		
	}
	
}

