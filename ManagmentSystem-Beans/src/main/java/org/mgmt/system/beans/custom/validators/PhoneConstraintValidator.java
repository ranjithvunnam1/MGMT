package org.mgmt.system.beans.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String>{

	public void initialize(Phone phone) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(String phone, ConstraintValidatorContext arg1) {
		if(phone == null) {
			return false;
		}
		return phone.matches("^\\+(?:[0-9] ?){6,14}[0-9]$");
	}

}
