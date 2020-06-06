package ems;

import static org.junit.Assert.*;

import java.io.*;
import javax.servlet.ServletException;

import org.springframework.mock.web.*;
import org.junit.Test;

public class ProjectTest {

	@Test
	public void testDoPostHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		MockHttpServletRequest req = new MockHttpServletRequest();
		MockHttpServletResponse res = new MockHttpServletResponse();
		req.addParameter("name", "EPDQ1");
		req.addParameter("location", "Nottingham");
		new Project().doPost(req, res);		
		assertTrue(res.getContentAsString().contains("New Record sucessfully registered"));

	}

}

