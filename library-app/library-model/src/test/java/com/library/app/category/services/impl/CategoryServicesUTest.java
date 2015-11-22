package com.library.app.category.services.impl;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.library.app.category.model.Category;
import com.library.app.category.services.CategoryServices;
import com.library.app.common.exception.FieldNotValidException;

public class CategoryServicesUTest {
	CategoryServices categoryServices;

	@Before
	public void initTestCase() {
		categoryServices = new CategoryServicesImpl();
	}

	@Test
	public void addCategoryWithNullName() {
		try {
			categoryServices.add(new Category());
			fail("An error should have been thrown");
		} catch (final FieldNotValidException e) {
			assertThat(e.getFieldName(), is(equalTo("name")));
		}
	}
}
