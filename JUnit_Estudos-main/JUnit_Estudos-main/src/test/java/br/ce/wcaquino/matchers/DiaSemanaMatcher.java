package br.ce.wcaquino.matchers;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import br.ce.wcaquino.utils.DataUtils;

public class DiaSemanaMatcher extends TypeSafeMatcher<Date>{

	private Integer diaSemana;
	
	
	public DiaSemanaMatcher(Integer diaSemana) {
		
		this.diaSemana = diaSemana;
	}

	public void describeTo(Description desc) {
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DAY_OF_WEEK,diaSemana);
		
		String data_Extenso = data.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.LONG,new Locale("pt","BR"));
		desc.appendText(data_Extenso);
	}

	@Override
	protected boolean matchesSafely(Date data) {
		return DataUtils.verificarDiaSemana(data,diaSemana);
	}
	

}
