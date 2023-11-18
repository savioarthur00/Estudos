package br.ce.wcaquino.matchers;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import br.ce.wcaquino.utils.DataUtils;

public class DataDiferencaDiasMatcher  extends TypeSafeMatcher<Date>{

	private int quantidade_Dias;
	
		
	public DataDiferencaDiasMatcher(int quantidade_Dias) {
		this.quantidade_Dias = quantidade_Dias;
	}

	public void describeTo(Description description) {
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DAY_OF_WEEK,Calendar.DAY_OF_WEEK);
		
		String data_Extenso = data.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.LONG,new Locale("pt","BR"));
		description.appendText(data_Extenso);
		
	}

	@Override
	protected boolean matchesSafely(Date data) {
		
		return DataUtils.isMesmaData(data, DataUtils.obterDataComDiferencaDias(quantidade_Dias));
	}
	

}
