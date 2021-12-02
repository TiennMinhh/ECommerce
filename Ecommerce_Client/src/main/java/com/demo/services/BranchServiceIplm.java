package com.demo.services;

import java.util.List;

import org.json.HTTP;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.models.BranchInfo;
import com.demo.models.ProductInfo;

@Service("branchService")
public class BranchServiceIplm implements BranchService {
	
	private String BASE_URL = "http://localhost:9596/api/branch/";	

	@Override
	public ResponseEntity<List<BranchInfo>> findAll() {
		try {
			RestTemplate restTemplate = new RestTemplate();
			return restTemplate.exchange(BASE_URL + "findall/", HttpMethod.GET, null,
					new ParameterizedTypeReference<List<BranchInfo>>() {
					});
		} catch (Exception e) {
			return null;
		}
	}
	
}
