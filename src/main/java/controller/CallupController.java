package main.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.response.DummyVO;
import main.java.response.GenericResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallupController {

	@RequestMapping(value = "/dummyAPI", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<GenericResponse> sendSmsByContact(
			HttpServletRequest request, HttpServletResponse response) {

		GenericResponse mHAGenericResponse = new GenericResponse();
		mHAGenericResponse.setStatus(HttpStatus.OK.value());
		
		DummyVO dummyVO = new DummyVO();
		dummyVO.setName("Name");
		dummyVO.setAge("13");
		dummyVO.setLocation("location");
		mHAGenericResponse.setData(dummyVO);

		return new ResponseEntity<GenericResponse>(mHAGenericResponse, HttpStatus.OK);
	}
}
