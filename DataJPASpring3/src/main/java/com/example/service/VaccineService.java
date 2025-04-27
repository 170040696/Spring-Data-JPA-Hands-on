package com.example.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.model.Vaccine;
import com.example.repository.iVaccineRepository;

@Service
public class VaccineService implements iVaccineService{
	
	@Autowired
	private iVaccineRepository iVaccineRepo;

	@Override
	public Iterable<Vaccine> featchingDetailes(Boolean status, String... properties) {
		// TODO Auto-generated method stub
		
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC,properties);
		return iVaccineRepo.findAll(sort);
		
	}

	@Override
	public List<Vaccine> FetchVaccineByPagination(int pageNumber, int PageSize, Boolean status, String... properties) {
		// TODO Auto-generated method stub
		PageRequest pageable=PageRequest.of(pageNumber, PageSize, status?Direction.ASC:Direction.DESC, properties);
		Page<Vaccine> page=iVaccineRepo.findAll(pageable);
		return page.getContent();
	}

	@Override
	public void FetchVaccinebyPages(int pagesize) {
		// TODO Auto-generated method stub
		long count=11;
		long pagecount=count/pagesize;
		pagecount=count%pagesize==0?pagecount:pagecount+1;
		System.out.println(pagecount);
		for(int i=0;i<pagecount;i++)
		{
			PageRequest pageable=PageRequest.of(i, pagesize);
			Page<Vaccine>page=iVaccineRepo.findAll(pageable);
			System.out.println("page number :"+i);
			page.getContent().forEach(l->System.out.println(l));
		}
		
	}	

}

