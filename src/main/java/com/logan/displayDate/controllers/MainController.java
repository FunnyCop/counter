package com.logan.displayDate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@RequestMapping( "/" )
	public String index( HttpSession session, Model model ) {
		
		if ( session.getAttribute( "count" ) == null ) {
			session.setAttribute( "count", 0 );
		} else {
			session.setAttribute( "count", Integer.parseInt( session.getAttribute( "count" ).toString() ) + 1 );
		}
		
		return "index.jsp";
	}
	
	@RequestMapping( "/counter" )
	public String counter( HttpSession session, Model model ) {
		
		model.addAttribute( session.getAttribute( "count" ) );
		
		return "counter.jsp";
	}

}
