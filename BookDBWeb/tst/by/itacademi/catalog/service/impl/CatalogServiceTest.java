package by.itacademi.catalog.service.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import by.itacademi.catalog.domain.vo.Catalog;
import by.itacademi.catalog.service.CatalogService;

public class CatalogServiceTest {

	private static CatalogService service;
	
	@BeforeClass
	public static void initTest(){
		service  = new SimpleCatalogImpl();
		
	}
	
	@Test
	public void testCatalogNotNull() {
		assertNotNull("The catalog was not created", service.getCatalog());
	}

	@Test
	public void testCatalogfilled(){
		Catalog catalog = service.getCatalog();
		assertNotNull("Imposeble catalog is null", catalog);
		assertNotNull("Catalog title is null", catalog.getTitle());
		assertNotNull("Catalog books is null", catalog.getBooks());
	}
	
	
	
}
