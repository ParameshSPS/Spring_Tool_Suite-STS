package com.zensar.db;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.bean.Advertises;

@Repository
public interface AdvertisesDAO extends JpaRepository<Advertises, Integer>{

	List<Advertises> findAdvertisesByTitle(String title);
	
}