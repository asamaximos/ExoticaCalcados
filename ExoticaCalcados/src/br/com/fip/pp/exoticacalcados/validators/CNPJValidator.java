package br.com.fip.pp.exoticacalcados.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("cnpjValidator")
public class CNPJValidator implements Validator {

	@Override
	public void validate(FacesContext contexto, UIComponent componente,
			Object valor) throws ValidatorException {
		if (!validaCNPJ((String) valor)){
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "CNPJ Inválido", "Favor Informar um CNPJ válido"));
		}

	}

	static public boolean validaCNPJ(String strCnpj) {

		strCnpj.replace('.', ' ');
		strCnpj.replace('-', ' ');
		strCnpj.replace('/', ' ');
		strCnpj.replaceAll(" ", "");
		int soma = 0, aux, dig;
		String cnpj_calc = strCnpj.substring(0, 12);

		if (strCnpj.length() != 14)
			return false;

		char[] chr_cnpj = strCnpj.toCharArray();

		/* Primeira parte */
		for (int i = 0; i < 4; i++)
			if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9)
				soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
		for (int i = 0; i < 8; i++)
			if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9)
				soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
		dig = 11 - (soma % 11);

		cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);

		/* Segunda parte */
		soma = 0;
		for (int i = 0; i < 5; i++)
			if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9)
				soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
		for (int i = 0; i < 8; i++)
			if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9)
				soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
		dig = 11 - (soma % 11);
		cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);

		return strCnpj.equals(cnpj_calc);
	}

}
