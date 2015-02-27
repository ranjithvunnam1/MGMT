package org.mgmt.system.beans.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConstraintValidator implements ConstraintValidator<Email, String>{

	public void initialize(Email email) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(String email, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(email == null) {
			return false;
		}
		return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}

}
