package util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.core.BandMaterial;
import com.core.Brand;
import  com.core.Category;
import com.core.Shape;
import com.core.Style;
import com.core.Watch;


public interface PopulateData {
	static Map<Integer,Watch> populatedData()
	{
		Map<Integer,Watch> watchList=new HashMap<>();
		Watch w=new Watch(0, "a",Category.MEN,Brand.TITAN ,Shape.CIRCLE,Style.CASUAL, BandMaterial.CERAMIC, 4, LocalDate.parse("2024-04-10"), LocalDate.parse("2024-04-12"), 45000,10);
		watchList.put(w.getId(), w);
		Watch w1=new Watch(0, "a",Category.MEN,Brand.TITAN ,Shape.CIRCLE,Style.CASUAL, BandMaterial.CERAMIC, 4, LocalDate.parse("2020-12-10"), LocalDate.parse("2021-12-12"), 45000,10);
		watchList.put(w1.getId(), w1);
		Watch w2=new Watch(0, "a",Category.MEN,Brand.TITAN ,Shape.CIRCLE,Style.CASUAL, BandMaterial.CERAMIC, 4, LocalDate.parse("2020-12-10"), LocalDate.parse("2021-12-12"), 45000,10);
		watchList.put(w2.getId(), w2);
		return watchList;
		
	}

}
