package com.app.dao;

import com.app.entities.Address;

public interface AddressDao {

	String assignUserAddress(Long userId,Address newAdr);

}
