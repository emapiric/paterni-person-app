/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.component.validator.impl;

import silab.sd.personapp.view.component.exception.ValidatorException;
import silab.sd.personapp.view.component.validator.Validator;

/**
 *
 * @author EMA
 */
public class RequiredStringValidator implements Validator{

    @Override
    public void validate(Object object) throws ValidatorException {
        if (!(object instanceof String)) throw new ValidatorException("Object is not String");
        if (object.toString().isEmpty()) throw new ValidatorException("String is empty");
    }
    
}
