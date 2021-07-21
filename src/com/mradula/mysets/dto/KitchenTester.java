package com.mradula.mysets.dto;
import java.util.*;
import com.mradula.mysets.dao.*;

public class KitchenTester {

	public static void main(String[] args) {
		
		KitchenItemDTO dto =  new KitchenItemDTO("Fryingpan" , 1700 , "frying" , "castiron");
		System.out.println(dto.hashCode());
		System.out.println(System.identityHashCode(dto));
		KitchenItemDTO dto1 =  new KitchenItemDTO("TeaPot" , 2500 , "teaStorage" , "ceramic");
		System.out.println(dto1.hashCode());
		System.out.println(System.identityHashCode(dto1));
		KitchenItemDTO dto2 =  new KitchenItemDTO("foodProcessor" , 12500 , "grinder" , "Plastic");
		System.out.println(dto2.hashCode());
		System.out.println(System.identityHashCode(dto2));
		
		//Set<KitchenItemDTO> set = new TreeSet<KitchenItemDTO>();
		KitchenDAO dao = new KitchenDAOImpl();
		
		dao.saveUnique(dto);
		dao.saveUnique(dto1);
		dao.saveUnique(dto2);
		
		Collection<KitchenItemDTO> collection1 = dao.findAllSortByUsedFor();
		for (KitchenItemDTO kitchenItem : collection1) {
			System.out.println(kitchenItem);
		}

		Collection<KitchenItemDTO> collection2 = dao.findAllSortByUsedForDesc();
		for (KitchenItemDTO kitchenItem : collection2) {
			System.out.println(kitchenItem);
		}

		Collection<KitchenItemDTO> collection3 = dao.findAllSortyName();
		for (KitchenItemDTO kitchenItem : collection3) {
			System.out.println(kitchenItem);
		}

		Collection<KitchenItemDTO> collection4 = dao.findAllSortByPriceDesc();
		for (KitchenItemDTO kitchenItem : collection4) {
			System.out.println(kitchenItem);
		}

	}

}
