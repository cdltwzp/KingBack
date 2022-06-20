/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.helloweenvsfei.struts.action;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

/**
 * MyEclipse Struts Creation date: 05-07-2008
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/dynaTest" name="dynaTestForm"
 *                input="/form/dynaTest.jsp" scope="request" validate="true"
 */
public class DynaTestAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		DynaActionForm dynaTestForm = (DynaActionForm) form;

		String name = (String) dynaTestForm.get("name");
		Integer age = (Integer) dynaTestForm.get("age");
		Date birthday = (Date) dynaTestForm.get("birthday");

		return mapping.getInputForward();
	}
}