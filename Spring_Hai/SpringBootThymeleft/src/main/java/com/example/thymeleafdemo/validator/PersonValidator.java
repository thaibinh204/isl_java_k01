package com.example.thymeleafdemo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.thymeleafdemo.model.Person;

@Component
public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Person person = (Person) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty");
		if (person.getFirstName().length() > 20) {
			errors.rejectValue("firstName", "maxsize.persn.name");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty");

	}
}
