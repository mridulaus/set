package com.mradula.mysets.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.mradula.mysets.dto.KitchenItemDTO;


public class KitchenDAOImpl  implements KitchenDAO {
	private Collection <KitchenItemDTO> list = new ArrayList<KitchenItemDTO>();
	
	@Override
	public boolean saveUnique(KitchenItemDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto " + dto);
		System.out.println("dto was added " + added);
		return added;

	
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedFor() {
//		System.out.println("findAllSortByUsedFor");
//		Collections.sort(list, new KitchenItemUsedForComparator());
return null;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedForDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortyName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByPriceDesc() {
		// TODO Auto-generated method stub
		return null;
	}

}
