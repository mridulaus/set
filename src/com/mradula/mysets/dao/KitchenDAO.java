package com.mradula.mysets.dao;
import java.util.Collection;
import com.mradula.mysets.dto.*;
public interface KitchenDAO {
	boolean saveUnique(KitchenItemDTO dto);
	Collection<KitchenItemDTO>findAllSortByUsedFor();
	Collection<KitchenItemDTO>findAllSortByUsedForDesc();
	Collection<KitchenItemDTO>findAllSortyName();
	Collection<KitchenItemDTO>findAllSortByPriceDesc();

}
